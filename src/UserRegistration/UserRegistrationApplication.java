package UserRegistration;

import UserRegistration.domein.Domain;
import UserRegistration.domein.Phonenumber;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.dto.UserCreateRequestDto;
import UserRegistration.repository.PhonenumberRepository;
import UserRegistration.repository.UserRepository;

import java.util.Scanner;

public class UserRegistrationApplication {
    public static void main(String[] args) {
      /*  Validator[] validators1 = new Validator[2];
        validators1[0] = new EmailValidator();
        validators1[1]=new PasswordValidator();
        Validator[] validators2 = new Validator[2];
        validators2[0] = new PhonenumberLengthValidator();
        validators2[1]=new PhonebumberCorrectValidator();*/

        /*ValidatesDomayn userValidator = new UserValidator(validators1);
        CrudeService userCrudService = new UserService(userValidator);

        ValidatesDomayn phonenumberValidator=new PhonenumberValidator(validators2);
        CrudeService phonenumberService=new PhonenumberService(phonenumberValidator);*/
        UserRepository userRepository=new UserRepository(5);
        PhonenumberRepository phonenumberRepository=new PhonenumberRepository((userRepository.getDomains().length*3));

        UserCreateRequestDto [] userCreateRequestDtos=new UserCreateRequestDto[1];
        PhonenumberCreateRequestDto[] phonenumberCreateRequestDtos=new PhonenumberCreateRequestDto[1];
        String firstname,lasname,email,password1,password2,username,phonenumber,userid;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<userCreateRequestDtos.length;i++){
            System.err.println("USER"+(i+1));
            userCreateRequestDtos[i]=new UserCreateRequestDto();
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
            phonenumberCreateRequestDtos[i]=new PhonenumberCreateRequestDto();
            Phonenumber phonenumber1=new Phonenumber();
            System.out.print("phonenumber : ");
            phonenumber1.setPhonenumber(scanner.nextLine());
            System.out.print("userID : ");
            phonenumber1.setUserId(scanner.nextInt());
           phonenumberCreateRequestDtos[i].setPhonenumber(phonenumber1);


        }
        for(UserCreateRequestDto dto : userCreateRequestDtos)
            userRepository.save(dto);
        for(PhonenumberCreateRequestDto dto:phonenumberCreateRequestDtos)
            phonenumberRepository.save(dto);

        for(Domain maim:userRepository.getDomains())
            if(maim!=null)
                System.out.println(maim);
        for(Domain maim:phonenumberRepository.getDomains())
            if(maim!=null)
                System.out.println(maim);


      /*  PhonenumberCreateRequestDto pto=new PhonenumberCreateRequestDto();
        pto.setPhonenumber(new Phonenumber("07245677"));*/
       /* DomainCreationResponse domainCreationResponse2=(DomainCreationResponse)phonenumberService.create(pto);
        DomainCreationResponse domainCreationResponse = (DomainCreationResponse) userCrudService.create(dto);*/

       /* for (ValidationResult validationResult : domainCreationResponse.getValidationResults()) {
            if (validationResult != null) {
                System.out.println(validationResult.getValidatorMessage());
            }
        }*/
    }
}
