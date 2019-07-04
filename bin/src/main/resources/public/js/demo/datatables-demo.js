// Call the dataTables jQuery plugin
$(document).ready(function() {
	
	
  $('#dataTable').dataTable({
			        "language": {
				           "lengthMenu": "",
				           "info": "_START_ - _END_ de _TOTAL_"
				      }   });
});
