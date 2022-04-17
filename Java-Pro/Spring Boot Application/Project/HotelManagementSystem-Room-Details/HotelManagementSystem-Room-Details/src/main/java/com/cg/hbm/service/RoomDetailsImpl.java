package com.cg.hbm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entities.RoomDetails;

import com.cg.hbm.exceptionhandling.RoomDetailsNotFoundException;
import com.cg.hbm.repository.IRoomDetailsRepository;

@Service
public class RoomDetailsImpl implements IRoomDetailsService {

    @Autowired
    private IRoomDetailsRepository room_Detailsrepository;

    @Override
    public RoomDetails addRoomDetails(RoomDetails roomDetails) {
        // TODO Auto-generated method stub
        return room_Detailsrepository.save(roomDetails);
    }

    @Override
    public RoomDetails updateRoomDetails(RoomDetails roomDetails, Integer room_id) {
        Optional<RoomDetails> existingRoomDetails = room_Detailsrepository.findById(room_id);
        if (existingRoomDetails.isPresent()) {
            RoomDetails roomDetails1 = existingRoomDetails.get();
            roomDetails1.setHotel_id(roomDetails.getHotel_id());
            roomDetails1.setRoom_no(roomDetails.getRoom_no());
            roomDetails1.setRoom_type(roomDetails.getRoom_type());
            roomDetails1.setRate_per_day(roomDetails.getRate_per_day());
            roomDetails1.setAvailable(roomDetails.isAvailable());

            return room_Detailsrepository.save(roomDetails1);
        } else {
            return room_Detailsrepository.save(roomDetails);
        }
    }

    @Override
    public void removeRoomDetails(Integer room_id) {
        RoomDetails roomDetails = showRoomDetails(room_id);
        room_Detailsrepository.deleteById(roomDetails.getRoom_id());

    }

    @Override
    public List<RoomDetails> showAllRoomDetails() {

        return room_Detailsrepository.findAll();
    }

    @Override
    public RoomDetails showRoomDetails(Integer room_id) {
        return room_Detailsrepository.findById(room_id)
                .orElseThrow(() -> new RoomDetailsNotFoundException("RoomDetails with Id " + room_id + " not found"));
    }
}
