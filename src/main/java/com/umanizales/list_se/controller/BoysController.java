package com.umanizales.list_se.controller;

import com.umanizales.list_se.controller.dto.ResponseDTO;
import com.umanizales.list_se.model.Boy;
import com.umanizales.list_se.service.ListSeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "boys")
public class BoysController {

    @Autowired
    private ListSeService listSeService;

    @PostMapping
    public ResponseEntity<ResponseDTO> addBoy(@RequestBody Boy boy)
    {
        return listSeService.addboy(boy);
    }

    @GetMapping
    public ResponseEntity<ResponseDTO> listBoys()
    {
        return listSeService.listBoys();
    }

    @GetMapping(path = "free")
    public ResponseEntity<ResponseDTO> listBoysFree()
    {
        return listSeService.listBoysFrees();
    }

    @GetMapping(path="invert")
    public  ResponseEntity<ResponseDTO> invertList()
    {
        return listSeService.invertList();
    }

    @PostMapping(path = "addtostart")
    public ResponseEntity<ResponseDTO> addToStart(@RequestBody Boy boy)
    {
        return listSeService.addToStart(boy);
    }

    @PostMapping(path = "addboys")
    public ResponseEntity<ResponseDTO> addboys(@RequestBody List<Boy> boys)
    {
        for (Boy boy:boys)
        {
            listSeService.addboy(boy);
        }
        return new ResponseEntity<ResponseDTO>(new ResponseDTO
                ("Niños Adicionados Con Exito",listSeService.listBoys(),null), HttpStatus.OK);
    }

    @GetMapping(path="getcount")
    public  ResponseEntity<ResponseDTO> getcount()
    {
        return listSeService.getCount();
    }

    @GetMapping(path="count")
    public  ResponseEntity<ResponseDTO> count()
    {
        return listSeService.count();
    }

    @GetMapping(path="changestarttoend")
    public  ResponseEntity<ResponseDTO> changeStartToEnd()
    {
        return listSeService.changeStartToEnd();
    }

    @GetMapping(path = "delete/{name}")
    public ResponseEntity<ResponseDTO> delete()
    {
        return listSeService.delete();
    }

    @GetMapping(path = "/list/{gender}")
    public ResponseEntity<ResponseDTO> gender(@PathVariable String gender)
    {
        return listSeService.gender();
    }


}
