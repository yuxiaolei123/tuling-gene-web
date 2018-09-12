package com.atguigu.git;

public class GitSingle {
	
	private GitSingle(){}
	
	private static GitSingle single = null;
	
	public static GitSingle getInstance(){
		if(single == null){
			single = new GitSingle();
		}
		
		return null;
	}

}
