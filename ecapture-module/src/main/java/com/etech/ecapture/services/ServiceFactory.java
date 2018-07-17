package com.etech.ecapture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 2:42:00 PM
 */


@Service
public class ServiceFactory {

	@Autowired private ActionServiceImpl actionServiceImpl;
	@Autowired private ActionGroupServiceImpl actionGroupServiceImpl;
	@Autowired private BatchServiceImpl batchServiceImpl;
	@Autowired private DataClassServiceImpl dataClassServiceImpl;
	@Autowired private DocumentFieldServiceImpl documentFieldServiceImpl;
	@Autowired private DocumentServiceImpl documentServiceImpl;
	@Autowired private FieldServiceImpl fieldServiceImpl;
	@Autowired private LogComponentServiceImpl logComponentServiceImpl;
	@Autowired private RoleServiceImpl roleServiceImpl;
	@Autowired private PermissionServiceImpl permissionServiceImpl;
	@Autowired private GroupServiceImpl groupServiceImpl;
	@Autowired private FolderServiceImpl folderServiceImpl;
	@Autowired private LookupServiceImpl lookupServiceImpl;
	@Autowired private UserServiceImpl userServiceImpl;
	@Autowired private LogServiceImpl logServiceImpl;
	@Autowired private LogMailServiceImpl logMailServiceImpl;
	 
	 
	public ActionServiceImpl getActionServiceImpl() {
		return actionServiceImpl;
	}
	public ActionGroupServiceImpl getActionGroupServiceImpl() {
		return actionGroupServiceImpl;
	}
	public BatchServiceImpl getBatchServiceImpl() {
		return batchServiceImpl;
	}
	public DataClassServiceImpl getDataClassServiceImpl() {
		return dataClassServiceImpl;
	}
	public DocumentFieldServiceImpl getDocumentFieldServiceImpl() {
		return documentFieldServiceImpl;
	}
	public DocumentServiceImpl getDocumentServiceImpl() {
		return documentServiceImpl;
	}
	public FieldServiceImpl getFieldServiceImpl() {
		return fieldServiceImpl;
	}
	public LogComponentServiceImpl getLogComponentServiceImpl() {
		return logComponentServiceImpl;
	}
	public RoleServiceImpl getRoleServiceImpl() {
		return roleServiceImpl;
	}
	public PermissionServiceImpl getPermissionServiceImpl() {
		return permissionServiceImpl;
	}
	public GroupServiceImpl getGroupServiceImpl() {
		return groupServiceImpl;
	}
	public FolderServiceImpl getFolderServiceImpl() {
		return folderServiceImpl;
	}
	public LookupServiceImpl getLookupServiceImpl() {
		return lookupServiceImpl;
	}
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public LogServiceImpl getLogServiceImpl() {
		return logServiceImpl;
	}
	public LogMailServiceImpl getLogMailServiceImpl() {
		return logMailServiceImpl;
	}

}