package com.bxtel;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class MyApplicationListener implements ApplicationListener
{
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("springevent:"+event);
	}
//
//    An ApplicationStartedEvent is sent at the start of a run, but before any processing except the registration of listeners and initializers.
//    An ApplicationEnvironmentPreparedEvent is sent when the Environment to be used in the context is known, but before the context is created.
//    An ApplicationPreparedEvent is sent just before the refresh is started, but after bean definitions have been loaded.
//    An ApplicationReadyEvent is sent after the refresh and any related callbacks have been processed to indicate the application is ready to service requests.
//    An ApplicationFailedEvent is sent if there is an exception on startup.
//    
//	@Override
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//		if(event.getApplicationContext().getParent() == null)//root application context 没有parent，他就是老大.
//        { 
//            //需要执行的逻辑代码，当spring容器初始化完成后就会执行该方法。 
//            System.out.println("\n\n\n\n\n______________\n\n\n加载了\n\n_________\n\n");
//        }
//        //或者下面这种方式
//        if(event.getApplicationContext().getDisplayName().equals("Root WebApplicationContext"))
//        {
//            System.out.println("\n\n\n_________\n\n加载一次的 \n\n ________\n\n\n\n");
//        }
//	}
}
