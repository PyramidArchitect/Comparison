package edu.nju.application.service;

import javax.ejb.Remote;

@Remote
public interface HelloRemote {
	void Dohello();
}
