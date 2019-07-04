angular
	.module('app',['ngMaterial'])
	.controller(
				'empleadoController', function($scope, $http){
					
					$scope.empleados = [];
					
					$scope.editarEmpleado = function (idEmpleado){

					}

					$scope.borrarEmpleado = function(){

					}

					$scope.agregarEmpleado = function(){

					}

					$scope.obtenerEmpleadoPorId = function(id){
						
						
					}

					$scope.cargarEmpleados = function (){	
						$http({
							method: 'GET',
							url: '/api/empleado/all'})
							.success(function( response, status, headers, config){
								$scope.empleados = response;
							});					
					}
					
		});

	