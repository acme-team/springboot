package com.yc.schedul;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * @author Administrator
 *
 */
@Component
public class SchedulingConfig {

	@Scheduled(cron = "0/20 * * * * ?")
	public void scheduler(){
		System.out.println("我是定时任务...");
	}
}
