package com.aaron.ren.strategypattern;

import com.aaron.ren.ioc.beanProcessor.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InspectionTest {

	@Autowired
	private static  InspectionSolverChooser chooser;




	public static void main(String[] args) {
		//准备数据
		String taskType = "INSPECTION_TASK_TYPE_BATCH_CHANGE_WAREHOUSE";
		Long orderId = 12345L;
		Long userId = 123L;
		//获取任务类型对应的solver
		InspectionSolver solver = chooser.choose(taskType);
		if (solver == null) {
			throw new RuntimeException("任务类型暂时无法处理!");
		}
		//调用不同solver的方法进行处理
		solver.solve(orderId,userId);


	}
}