package com.rpst.yc.server.logic.code;
import java.awt.Image;
import java.rmi.RemoteException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.rpst.yc.commons.code.YCValues;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.def.RServer;
import com.rpst.yc.commons.dt.code.Computer;
import com.rpst.yc.commons.dt.code.User;

public class Server extends Computer implements RServer {
	protected ClientColl Clients;
	protected SessionColl sessions;
	public final static Logger LOGGER=Logger.getLogger(Server.class.getName());
	public Server() {
		super("","");
		Clients=ClientColl.getInstance();
		sessions=SessionColl.getInstance();
	}
	
	//Client Management
	@Override
	public boolean addClient(RClient cl) throws RemoteException{
		System.out.println("NEw Client Loaded");
                this.getSnapshot(cl);
		return Clients.addClient(cl);
		
	}
	@Override
	public boolean removeClient(RClient cl) throws RemoteException{
		return Clients.removeClient(cl);
	}
	public boolean isClientFree(){
		return Clients.haveFreeClient();
	}
	public ClientColl getClientCollection(){
		return this.Clients;
	}
	// Client Commands
	public Image getSnapshot(RClient cl){
		return null;
	}
	public boolean sendMessage(RClient cl){
		return true;
	}
	//Client commands
	//End Client Management
	//Session Management
	public UUID createUserSession(User us){
		if(isClientFree()){
			RClient cl=Clients.getFreeClient();
			return sessions.createSession(cl, us);
		}
		return null;
	}
	public int getUPC(UUID sid){
		return sessions.getCostPerSession(sid);
	}
	public boolean destroySession(UUID sid){
		return sessions.destroySession(sid);
	}
	public RClient getClientFromSID(UUID sid){
		return sessions.getClientFromUUID(sid);
	}
	public SessionColl getSessionCollection(){
		return this.sessions;
	}
	// -end Session Management
	// Server instances
	@Override
	public int getType() {
		return YCValues.CT_Server;
	}
	@Override
	public String getSlug() {
		return YCValues.Server_slug;
	}
}