package com.example.liz.httpurlconnectionjsondemo;

import android.annotation.SuppressLint;
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
            mTextViewIdRepo         = itemView.findViewById(R.id.text_id_repo);
            mTextViewNameRepo       = itemView.findViewById(R.id.text_name_repo);
            mTextViewIdOwner        = itemView.findViewById(R.id.text_id_owner);
            mTextViewLoginOwner     = itemView.findViewById(R.id.text_login_owner);
            mTextViewKeyLiscense    = itemView.findViewById(R.id.text_key_license);
            mTextViewNameLiscense   = itemView.findViewById(R.id.text_name_license);
        }
        @SuppressLint("SetTextI18n")
        public void setView(Repo repo){
            mTextViewIdRepo.setText(R.string.repo_id+repo.getmId());
            mTextViewNameRepo.setText(R.string.repo_name+repo.getmName());
            mTextViewIdOwner.setText(R.string.owner_id+repo.getmOwner().getmID());
            mTextViewLoginOwner.setText(R.string.owner_login+repo.getmOwner().getmLogin());
            mTextViewKeyLiscense.setText(R.string.license_key+repo.getmLicense().getmKey());
            mTextViewNameLiscense.setText(R.string.license_name+repo.getmLicense().getmName());
        }
    }
}
