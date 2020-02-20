package layer;

	@Repository
	 interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
	    
	    CustomerEntity findByUsername(String username);
	    
}
