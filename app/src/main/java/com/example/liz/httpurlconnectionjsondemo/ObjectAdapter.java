package com.example.liz.httpurlconnectionjsondemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.liz.httpurlconnectionjsondemo.object.Repo;

import java.util.List;

public class ObjectAdapter extends RecyclerView.Adapter<ObjectAdapter.ObjectViewHolder>{

    List<Repo> mRepo;

    public ObjectAdapter(List<Repo> mRepo) {
        this.mRepo = mRepo;
    }

    @NonNull
    @Override
    public ObjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.api_layout,parent,false);
        return new ObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectViewHolder holder, int position) {
        holder.setView(mRepo.get(position));
    }

    @Override
    public int getItemCount() {
        if(mRepo != null){
            return mRepo.size();
        }
        return 0;
    }

    class ObjectViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextViewIdRepo;
        private TextView mTextViewNameRepo;
        private TextView mTextViewIdOwner;
        private TextView mTextViewLoginOwner;
        private TextView mTextViewKeyLiscense;
        private TextView mTextViewNameLiscense;
        public ObjectViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewIdRepo         = itemView.findViewById(R.id.text_idrepo);
            mTextViewNameRepo       = itemView.findViewById(R.id.text_namerepo);
            mTextViewIdOwner        = itemView.findViewById(R.id.text_idowner);
            mTextViewLoginOwner     = itemView.findViewById(R.id.text_loginowner);
            mTextViewKeyLiscense    = itemView.findViewById(R.id.text_keyliscense);
            mTextViewNameLiscense   = itemView.findViewById(R.id.text_nameliscense);
        }
        public void setView(Repo repo){
            mTextViewIdRepo.setText("Repo ID : "+repo.getmId());
            mTextViewNameRepo.setText("Repo Name :"+repo.getmName());
            mTextViewIdOwner.setText("Owner ID :"+repo.getmOwner().getmID());
            mTextViewLoginOwner.setText("Owner Login : "+repo.getmOwner().getmLogin());
            mTextViewKeyLiscense.setText("License Key : "+repo.getmLicense().getmKey());
            mTextViewNameLiscense.setText("License Name : "+repo.getmLicense().getmName());
        }
    }
}
