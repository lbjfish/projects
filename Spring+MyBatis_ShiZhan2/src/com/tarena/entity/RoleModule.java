package com.tarena.entity;

public class RoleModule {
	private Integer role_id;
	private Integer module_id;
	
	public Integer getRole_id() {
		return role_id;
	}


	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}


	public Integer getModule_id() {
		return module_id;
	}


	public void setModule_id(Integer module_id) {
		this.module_id = module_id;
	}

	public RoleModule(){
		
	}
	public RoleModule(Integer role_id, Integer module_id) {
		super();
		this.role_id = role_id;
		this.module_id = module_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((module_id == null) ? 0 : module_id.hashCode());
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final RoleModule other = (RoleModule) obj;
		if (module_id == null) {
			if (other.module_id != null)
				return false;
		} else if (!module_id.equals(other.module_id))
			return false;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		return true;
	}

	public String toString(){
		return role_id+","+module_id;
	}
}
