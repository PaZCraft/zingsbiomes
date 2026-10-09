package com.zing.zingsbiomes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber
public final class ServerWorkQueue {
	private static final List<ScheduledTask> TASKS = new ArrayList<>();

	private ServerWorkQueue() {
	}

	public static void queueServerWork(int ticks, Runnable task) {
		if (ticks < 0) {
			throw new IllegalArgumentException("ticks must not be negative");
		}
		synchronized (TASKS) {
			TASKS.add(new ScheduledTask(ticks, Objects.requireNonNull(task, "task")));
		}
	}

	@SubscribeEvent
	public static void onServerTick(ServerTickEvent.Post event) {
		List<Runnable> readyTasks = new ArrayList<>();
		synchronized (TASKS) {
			for (Iterator<ScheduledTask> iterator = TASKS.iterator(); iterator.hasNext();) {
				ScheduledTask task = iterator.next();
				if (--task.ticksRemaining <= 0) {
					readyTasks.add(task.action);
					iterator.remove();
				}
			}
		}
		readyTasks.forEach(Runnable::run);
	}

	private static final class ScheduledTask {
		private int ticksRemaining;
		private final Runnable action;

		private ScheduledTask(int ticksRemaining, Runnable action) {
			this.ticksRemaining = ticksRemaining;
			this.action = action;
		}
	}
}
