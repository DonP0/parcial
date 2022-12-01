package com.parcial.pdf;

import java.util.Map;

import javax.swing.text.Document;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.parcial.entity.Mascotas;





public abstract class Pdf extends AbstractPdfView{

	@Override
	protected <PdfPTable, Mascota> void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		@SuppressWarnigs("unchecked")
		List<Mascota> Listadomascotas = (List<Mascota>)model.get("mascotas");
		
		PdfPTable tablamascotas = new  PdfPTable(4);
		 Listadomascotas.forEach(mascotas ->{
			 tablamascotas.addCell(mascotas.getId().toString());
			 tablamascotas.addCell(mascotas.getnombre());
			 tablamascotas.addCell(mascotas.getdueño());
			 tablamascotas.addCell(mascotas.getdescripcion());
			 
		 }); 
		 document.add(tablamascotas);
	}

		
	}

	
	
	
	
