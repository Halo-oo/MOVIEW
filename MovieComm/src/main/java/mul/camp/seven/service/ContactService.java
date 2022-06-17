package mul.camp.seven.service;

import java.util.List;

import mul.camp.seven.dto.ContactDto;
import mul.camp.seven.dto.ContactParam;



public interface ContactService {
	List<ContactDto> contact(ContactParam param);
	
	int contactwrite(ContactDto dto);
	
	ContactDto getContact(int seq);
	
	void reply(ContactDto dto);
	
	int deletecontact(ContactDto dto);
	
	int contactupdate(ContactDto dto);
}
