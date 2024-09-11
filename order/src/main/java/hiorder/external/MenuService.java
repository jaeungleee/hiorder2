package hiorder.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "menu", url = "${api.url.menu}")
public interface MenuService {

    @GetMapping(path = "/menus/search/findByGetMenu/{id}")
    public Menu getMenu(@PathVariable("id") Long id); // 올바른 어노테이션 및 파라미터 사용

}