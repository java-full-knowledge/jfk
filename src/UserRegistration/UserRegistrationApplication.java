package UserRegistration;

import UserRegistration.domein.Domain;
import UserRegistration.domein.Phonenumber;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.repository.PhonenumberRepository;
import UserRegistration.repository.UserRepository;
import UserRegistration.service.PhonenumberService;
import UserRegistration.service.UserService;
import UserRegistration.validators.domainvalidator.PhonenumberValidator;
import UserRegistration.validators.domainvalidator.UserValidator;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.validator.*;

import java.util.Scanner;

public class UserRegistrationApplication {
    public static void main(String[] args) {

        Validator[] validators1 = new Validator[2];
        validators1[0] = new EmailValidator();
        validators1[1] = new PasswordValidator();

        Validator[] validators2 = new Validator[2];
        validators2[0] = new PhonenumberLengthValidator();
        validators2[1] = new PhonebumberCorrectValidator();

        UserRepository userRepository = new UserRepository(5);
        PhonenumberRepository phonenumberRepository = new PhonenumberRepository((userRepository.getUsers().length * 3));

        UserCreateRequestDto[] userCreateRequestDtos = new UserCreateRequestDto[1];
        PhonenumberCreateRequestDto[] phonenumberCreateRequestDtos = new PhonenumberCreateRequestDto[1];
        String firstname, lasname, email, password1, password2, username, phonenumber, userid;
        Scanner scanner = new Scanner(System.in);

        ValidatesDomayn userValidator = new UserValidator(validators1);
        ValidatesDomayn phonenumberValidator = new PhonenumberValidator(validators2);

        UserService userService = new UserService(userValidator, userRepository);
        PhonenumberService phonenumberService = new PhonenumberService(phonenumberValidator, phonenumberRepository);

        for (int i = 0; i < userCreateRequestDtos.length; i++) {
            System.err.println("USER" + (i + 1));
            userCreateRequestDtos[i] = new UserCreateRequestDto();
            System.out.print("firstname :");
            userCreateRequestDtos[i].setFirstname(scanner.nextLine());
            System.out.print("lastname : ");
            userCreateRequestDtos[i].setLastname(scanner.nextLine());
            System.out.print("username : ");
            userCreateRequestDtos[i].setUserName(scanner.nextLine());
            System.out.print("email : ");
            userCreateRequestDtos[i].setEmail(scanner.nextLine());
            System.out.print("password1 : ");
            userCreateRequestDtos[i].setPassword1(scanner.nextLine());
            System.out.print("password2 : ");
            userCreateRequestDtos[i].setPassword2(scanner.nextLine());
            phonenumberCreateRequestDtos[i] = new PhonenumberCreateRequestDto();
            Phonenumber phonenumber1 = new Phonenumber();
            System.out.print("phonenumber : ");
            phonenumber1.setPhonenumber(scanner.nextLine());
            System.out.print("userID : ");
            phonenumber1.setUserId(scanner.nextInt());
            phonenumberCreateRequestDtos[i].setPhonenumber(phonenumber1);

        }

        for (UserCreateRequestDto dto : userCreateRequestDtos) {
            DomainCreationResponse domainCreationResponse = (DomainCreationResponse) userService.create(dto);
            userService.getRepository().save(domainCreationResponse);
        }
        for (PhonenumberCreateRequestDto dto : phonenumberCreateRequestDtos) {
            DomainCreationResponse domainCreationResponse = (DomainCreationResponse) phonenumberService.create(dto);
            phonenumberService.getRepository().save(domainCreationResponse);
        }


        for (Domain maim : userService.getRepository().getUsers())
            if (maim != null)
                System.out.println(maim);
        System.out.println();
        for (Domain maim : phonenumberService.getRepository().getPhonenumbers())
            if (maim != null)
                System.out.println(maim);
        System.out.println();

        UserCreateRequestDto us=new UserCreateRequestDto();
        us.setFirstname("sss");
        us.setLastname("www");
        us.setEmail("arman@");
        us.setUserName("at");
        us.setPassword2("1");
        us.setPassword1("1");
        userService.update(us);
        for (Domain maim : userService.getRepository().getUsers())
            if (maim != null)
                System.out.println(maim);
        System.out.println();


    }
}
