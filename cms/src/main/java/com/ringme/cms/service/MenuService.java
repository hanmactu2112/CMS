package com.ringme.cms.service;

import com.ringme.cms.model.Menu;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface MenuService {

    void saveMenu(Menu menu);

    Optional<Menu> findMenuById(Long id);

    void deleteById(Long id);

    Page<Menu> findMenuPage(int pageNo, int pageSize);
}
