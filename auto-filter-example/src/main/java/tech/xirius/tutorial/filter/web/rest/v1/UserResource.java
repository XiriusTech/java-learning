package tech.xirius.tutorial.filter.web.rest.v1;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import tech.xirius.tutorial.filter.entities.User;
import tech.xirius.tutorial.filter.entities.UserFilter;
import tech.xirius.tutorial.filter.repository.UserRepository;
import tech.xirius.tutorial.filter.services.specifications.UserSpecification;


@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
@Api(description = "Allows finding users.", tags = { "Tutorial" })
public class UserResource {
    private UserRepository userRepository;

    @GetMapping("")
    @ApiOperation("Test the filter of user entity")
    public Page<User> findUsers(@Valid UserFilter filter, Pageable pageable) {
        Specification<User> spec = new UserSpecification(filter);
        
        return userRepository.findAll(spec, pageable);
    }
}
