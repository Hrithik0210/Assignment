package com.example.assignment

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(private val messageList: MutableList<Message>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val messageTextView: TextView? = itemView.findViewById(R.id.messageTextView)
        val messageImageView: ImageView? = itemView.findViewById(R.id.messageImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messageList[position]

        // Show text or image based on the content of the message
        if (message.content != null) {
            holder.messageTextView?.text = message.content
            holder.messageTextView?.visibility = View.VISIBLE
            holder.messageImageView?.visibility = View.GONE
        } else if (message.image != null) {
            holder.messageImageView?.setImageBitmap(message.image)
            holder.messageImageView?.visibility = View.VISIBLE
            holder.messageTextView?.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    // Add message and notify adapter
    fun addMessage(message: Message) {
        messageList.add(message)
        notifyItemInserted(messageList.size - 1)
    }
}
