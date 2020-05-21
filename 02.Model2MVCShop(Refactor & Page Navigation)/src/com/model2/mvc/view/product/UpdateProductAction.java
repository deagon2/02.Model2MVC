package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;


public class UpdateProductAction extends Action {

	@Override
	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		/* ===========================¼öÁ¤Àü=======================
		 int prodNo=Integer.parseInt(request.getParameter("prodNo"));
		
		ProductVO productVO = new ProductVO();
		productVO.setProdNo(prodNo);
		productVO.setProdName(request.getParameter("prodName"));
		productVO.setProdDetail(request.getParameter("prodDetail"));
		productVO.setPrice(Integer.parseInt(request.getParameter("price")));
		productVO.setFileName(request.getParameter("fileName"));
				
		ProductService service = new ProductServiceImpl();
		service.updateProduct(productVO);
		HttpSession session = request.getSession();
		int sessionId = ((ProductVO)session.getAttribute("product")).getProdNo();
		if( sessionId == prodNo){
		session.setAttribute("product", productVO);
		}
		
		return "forward:/getProduct.do?"+prodNo+"&menu=manage";
		 */
		
		
		 int prodNo=Integer.parseInt(request.getParameter("prodNo"));
		
		Product productVO = new Product();
		productVO.setProdNo(prodNo);
		productVO.setProdName(request.getParameter("prodName"));
		productVO.setProdDetail(request.getParameter("prodDetail"));
		productVO.setPrice(Integer.parseInt(request.getParameter("price")));
		productVO.setFileName(request.getParameter("fileName"));
				
		ProductService service = new ProductServiceImpl();
		service.updateProduct(productVO);
		HttpSession session = request.getSession();
		int sessionId = ((Product)session.getAttribute("product")).getProdNo();
		if( sessionId == prodNo){
		session.setAttribute("product", productVO);
		}
		
		return "forward:/getProduct.do?"+prodNo+"&menu=manage";
		 
		
	}
}