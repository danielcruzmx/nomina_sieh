/*----- Tab Links -----*/
$j(document).ready(function() {
	$j('.tabs .tab-links a').on('click', function(e) {
		var currentAttrValue = $j(this).attr('href');

		// Show/Hide Tabs
		$j('.tabs ' + currentAttrValue).show().siblings().hide();

		// Change/remove current tab to active
		$j(this).parent('li').addClass('active').siblings().removeClass('active');

		e.preventDefault();
	});
});