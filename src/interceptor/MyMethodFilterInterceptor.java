package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyMethodFilterInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		//获取拦截器名
		String className = arg0.getClass().getName();
		long startTime = System.currentTimeMillis();
		//当前时间
		System.out.println("-------------拦截器"+name+className+"执行前");
		String result = arg0.invoke();
		long endTime = System.currentTimeMillis();
		System.out.println("----------------在action"+className+"执行后"+"用时。。。"
				+(endTime-startTime)+"ms");
		return result;
	}


}
