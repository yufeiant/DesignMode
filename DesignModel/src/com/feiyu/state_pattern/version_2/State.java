package com.feiyu.state_pattern.version_2;

import com.feiyu.state_pattern.version_2.Work;

public abstract class State {
	public abstract void Handle(Work work);
}
