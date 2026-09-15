package com.attendly.workshop_service.port.in;

import com.attendly.workshop_service.usecase.CreateWorkshopInput;
import com.attendly.workshop_service.usecase.CreateWorkshopOutput;

public interface CreateWorkshop {

   CreateWorkshopOutput create (CreateWorkshopInput input);
}
