package com.umanizales.list_se.service;


import com.umanizales.list_se.controller.dto.ResponseDTO;
import com.umanizales.list_se.model.Boy;
import com.umanizales.list_se.model.ListSE;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ListSeService {

    private ListSE ListBoys;

    public ListSeService()
    {
        ListBoys = new ListSE();
    }

    public ResponseEntity<ResponseDTO> addboy(Boy boy)
    {
        ListBoys.add(boy);
        return new ResponseEntity<>(new ResponseDTO("Niño Agregado", true, null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> addToStart(Boy boy)
    {
        ListBoys.addToStart(boy);
        return new ResponseEntity<>(new ResponseDTO("Niño Agregado", true, null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> listBoysFrees()
    {
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", ListBoys.list(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> listBoys()
    {
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", ListBoys.getHead(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> invertList()
    {
        ListBoys.invert();
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", ListBoys.getHead(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> getCount()
    {
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", ListBoys.getCount(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> count()
    {
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", ListBoys.count(), null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> changeStartToEnd()
    {
        ListBoys.changeStartToEnd();
        return new ResponseEntity<>(new ResponseDTO("Satisfactorio", true, null), HttpStatus.OK);
    }

    public ResponseEntity<ResponseDTO> delete()
    {
        ListBoys.delete();
        return new ResponseEntity<>(new ResponseDTO("Niño Eliminado", true, null), HttpStatus.OK);
    }


}
