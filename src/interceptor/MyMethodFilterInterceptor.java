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
		//��ȡ��������
		String className = arg0.getClass().getName();
		long startTime = System.currentTimeMillis();
		//��ǰʱ��
		System.out.println("-------------������"+name+className+"ִ��ǰ");
		String result = arg0.invoke();
		long endTime = System.currentTimeMillis();
		System.out.println("----------------��action"+className+"ִ�к�"+"��ʱ������"
				+(endTime-startTime)+"ms");
		return result;
	}


}
