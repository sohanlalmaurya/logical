package com.logical.code.designpatterns.creational.objectpool.second;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ObjectPoolSecondDemo {
	private ObjectPoolSecond<ExportingProcess> pool;
	private AtomicLong processNo = new AtomicLong(0);

	public void setUp() {

		pool = new ObjectPoolSecond<ExportingProcess>(4, 10, 5) {
			protected ExportingProcess createObject() {
				// create a test object which takes some time for creation
				return new ExportingProcess(processNo.incrementAndGet());
			}
		};
	}

	public void tearDown() {
		pool.shutdown();
	}

	public void testObjectPool() {
		ExecutorService executor = Executors.newFixedThreadPool(8);

		// execute 8 tasks in separate threads

		executor.execute(new ExportingTask(pool, 1));
		executor.execute(new ExportingTask(pool, 2));
		executor.execute(new ExportingTask(pool, 3));
		executor.execute(new ExportingTask(pool, 4));
		executor.execute(new ExportingTask(pool, 5));
		executor.execute(new ExportingTask(pool, 6));
		executor.execute(new ExportingTask(pool, 7));
		executor.execute(new ExportingTask(pool, 8));

		executor.shutdown();
		try {
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e)

		{
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		ObjectPoolSecondDemo op = new ObjectPoolSecondDemo();
		op.setUp();
		op.tearDown();
		op.testObjectPool();
	}
}
