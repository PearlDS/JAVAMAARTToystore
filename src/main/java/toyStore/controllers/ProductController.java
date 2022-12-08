package toyStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import toyStore.services.interfaces.ProductService;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String showAllProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "productPage";
    }

    @GetMapping("/productsBS")
    public String showAllProductsBS(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "index";
    }

    @GetMapping("/singleProduct/{id}")
    public String showOneProductById(@PathVariable String id,  Model model){
        int idInInt;
        try {
            idInInt = Integer.parseInt(id);
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            return "redirect:/productsBS";
        }


        model.addAttribute("product", productService.getProductById(idInInt));
        return "singleProduct";
    }





}
