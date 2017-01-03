package com.niit.ecommercebackend.dao;

	import java.util.List;

	import com.niit.ecommercebackend.model.Supplier;

	public interface SupplierDAO {

		public void addSupplier(Supplier p);
		public void updateSupplier(Supplier p);
		public List<Supplier> listSuppliers();
		public Supplier getSupplierById(int id);
		public void removeSupplier(int id);

	}

