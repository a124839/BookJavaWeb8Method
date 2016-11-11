package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String method1(){
		ActionContext.getContext().put("msg", "����1��ִ��");
		System.out.println("����1��ִ��");
		return SUCCESS;
	}
	public String method2(){
		ActionContext.getContext().put("msg", "����2��ִ��");
		System.out.println("����2��ִ��");
		return SUCCESS;
	}
	public String method3(){
		ActionContext.getContext().put("msg", "����3��ִ��");
		System.out.println("����3��ִ��");
		return SUCCESS;
	}
	@Override
	public String execute() throws Exception {
		ActionContext.getContext().put("msg", "execute������ִ��");
		System.out.println("execute������ִ��");
		return SUCCESS;
	}
	
}
