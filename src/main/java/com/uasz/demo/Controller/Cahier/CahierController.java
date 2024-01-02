package com.uasz.demo.Controller.Cahier;

import com.uasz.demo.Model.Cahier.Cahier;
import com.uasz.demo.Repository.Cahier.CahierRepository;

import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Controller @AllArgsConstructor
public class CahierController {
    private CahierRepository ueRepository;

    @GetMapping("/uasz")
    public String index(@NotNull Model model,
                        @RequestParam(name = "page", defaultValue = "0") int p,
                        @RequestParam(name = "size", defaultValue = "4") int s,
                        @RequestParam(name = "keyword", defaultValue = "") String kw

    ){
        Page<Cahier> pageListUE = ueRepository.findBylibelleContains(kw,PageRequest.of(p,s));
        model.addAttribute("list", pageListUE.getContent());
        model.addAttribute("pages", new int[pageListUE.getTotalPages()]);
        model.addAttribute("currentPage",p);
        model.addAttribute("keyword",kw);
        return "ue";
    }

    @GetMapping("/delete")
    public String delete(Long id, String keyword, int page){
        ueRepository.deleteById(id);
        return  "redirect:/uasz?page="+page+"&keyword="+keyword;
    }
}
