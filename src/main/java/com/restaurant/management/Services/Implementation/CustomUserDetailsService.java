// package com.restaurant.management.Services.Implementation;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.restaurant.management.Entity.User;
// import com.restaurant.management.Helper.Role;
// import com.restaurant.management.Repository.UserRepository;

// import java.util.Collection;
// import java.util.stream.Collectors;

// @Service
// public class CustomUserDetailsService implements UserDetailsService {

//     @Autowired
//     private UserRepository userRepository;

    

//     public CustomUserDetailsService(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }



//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//         User user = userRepository.findUserByUserName(username);
//         if (user != null) {
//             return new org.springframework.security.core.userdetails.User(user.getUserName()
//                     , user.getPassWord(),
//                     user.getRoles().stream()
//                             .map((role) -> new SimpleGrantedAuthority(role.getName()))
//                             .collect(Collectors.toList()));
//         } else {
//             throw new UsernameNotFoundException("Invalid email or password");
//         }
//     }

//     private Collection < ? extends GrantedAuthority> mapRolesToAuthorities(Collection <Role> roles) {
//         Collection < ? extends GrantedAuthority> mapRoles = roles.stream()
//                 .map(role -> new SimpleGrantedAuthority(role.getName()))
//                 .collect(Collectors.toList());
//         return mapRoles;
//     }
// }
