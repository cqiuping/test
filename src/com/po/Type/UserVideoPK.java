package com.po.Type;

import java.io.Serializable;

public class UserVideoPK implements Serializable{
	private int uid;
	private int vid;
	
	
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public int getVid() {
		return vid;
	}


	public void setVid(int vid) {
		this.vid = vid;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof UserVideoPK))
			return false;
			UserVideoPK uPk=(UserVideoPK)obj;
		if(uPk.equals(this))
			return true;
		if(uPk.getUid()==uid && uPk.getVid()==vid)
			return true;
		else return false;
	}
	
}
