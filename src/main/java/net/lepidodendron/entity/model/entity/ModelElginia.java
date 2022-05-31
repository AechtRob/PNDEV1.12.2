package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraElginia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElginia extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended elginia;
    private final AdvancedModelRendererExtended lowerbody;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended backleftleg4;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended backleftleg5;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended backleftleg6;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended frontrightleg;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended frontrightleg2;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended frontrightleg3;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended frontleftleg4;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended frontleftleg5;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended frontleftleg6;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended cube_r36;
    private final AdvancedModelRendererExtended cube_r37;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r38;
    private final AdvancedModelRendererExtended cube_r39;
    private final AdvancedModelRendererExtended cube_r40;
    private final AdvancedModelRendererExtended body;

    private ModelAnimator animator;

    public ModelElginia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.elginia = new AdvancedModelRendererExtended(this);
        this.elginia.setRotationPoint(0.0F, 19.75F, 0.0F);


        this.lowerbody = new AdvancedModelRendererExtended(this);
        this.lowerbody.setRotationPoint(0.0F, -7.4F, 8.25F);
        this.elginia.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.1745F, 0.0F, 0.0F);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 0, 5, 0.0F, -0.6055F, 0.0257F, 0, 1, 3, 0.0F, true));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 0, 5, -2.5F, -0.6055F, 0.0257F, 0, 1, 3, 0.0F, true));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 0, 5, 2.5F, -0.6055F, 0.0257F, 0, 1, 3, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 26, 19, -4.0F, -0.0616F, -0.34F, 8, 7, 4, 0.0F, false));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-3.7164F, 4.4147F, 0.66F);
        this.lowerbody.addChild(backrightleg);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.7836F, 0.0237F, -0.5F);
        this.backrightleg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2497F, 0.5193F, 0.4768F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 9, -1.75F, -2.0F, -1.75F, 3, 5, 4, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(-3.0F, 2.0F, -0.75F);
        this.backrightleg.addChild(backrightleg2);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.1413F, 1.6375F, -0.7178F);
        this.backrightleg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 50, -0.5671F, -1.7974F, -0.75F, 2, 5, 3, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(0.4787F, 3.2912F, -0.4678F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.1745F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 47, -1.7619F, 0.1082F, -2.0F, 3, 2, 4, 0.0F, false));

        this.backleftleg4 = new AdvancedModelRendererExtended(this);
        this.backleftleg4.setRotationPoint(3.7164F, 4.4147F, 0.66F);
        this.lowerbody.addChild(backleftleg4);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.7836F, 0.0237F, -0.5F);
        this.backleftleg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2497F, -0.5193F, -0.4768F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 9, -1.25F, -2.0F, -1.75F, 3, 5, 4, 0.0F, true));

        this.backleftleg5 = new AdvancedModelRendererExtended(this);
        this.backleftleg5.setRotationPoint(3.0F, 2.0F, -0.75F);
        this.backleftleg4.addChild(backleftleg5);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.1413F, 1.6375F, -0.7178F);
        this.backleftleg5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 50, -1.4329F, -1.7974F, -0.75F, 2, 5, 3, 0.0F, true));

        this.backleftleg6 = new AdvancedModelRendererExtended(this);
        this.backleftleg6.setRotationPoint(-0.4787F, 3.2912F, -0.4678F);
        this.backleftleg5.addChild(backleftleg6);
        this.setRotateAngle(backleftleg6, 0.1745F, 0.0F, 0.0F);
        this.backleftleg6.cubeList.add(new ModelBox(backleftleg6, 0, 47, -1.2381F, 0.1082F, -2.0F, 3, 2, 4, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.4384F, 4.66F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 31, 0, -3.0F, 0.0F, -1.5F, 6, 5, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 2.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 51, 0, -2.0F, 0.25F, 0.0F, 4, 3, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 52, -1.0F, 0.5F, -0.5F, 2, 2, 3, 0.0F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.0F, 0.3726F, -0.1455F);
        this.lowerbody.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.3491F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 5, -2.5F, -2.6306F, -14.3249F, 0, 1, 3, 0.0F, false));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 5, 2.5F, -2.6306F, -14.3249F, 0, 1, 3, 0.0F, true));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 5, 0.0F, -2.8806F, -14.3249F, 0, 1, 3, 0.0F, true));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 19, -4.5F, -2.2215F, -14.4082F, 9, 7, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRendererExtended(this);
        this.frontrightleg.setRotationPoint(-4.2164F, 3.1048F, -11.6582F);
        this.upperbody.addChild(frontrightleg);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.0336F, 0.0237F, -0.5F);
        this.frontrightleg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.202F, -0.0829F, 1.0388F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 42, -1.5F, -1.0F, -1.75F, 3, 4, 4, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRendererExtended(this);
        this.frontrightleg2.setRotationPoint(-2.0F, 0.75F, 0.75F);
        this.frontrightleg.addChild(frontrightleg2);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.283F, 1.919F, 0.2046F);
        this.frontrightleg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1313F, 0.1321F, 0.0115F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.2824F, -2.1875F, -2.3464F, 2, 5, 3, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRendererExtended(this);
        this.frontrightleg3.setRotationPoint(-0.2515F, 3.5249F, -0.9465F);
        this.frontrightleg2.addChild(frontrightleg3);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.5345F, -1.606F, 1.1511F);
        this.frontrightleg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1313F, 0.1321F, 0.0115F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 46, -1.7824F, 1.8125F, -3.3464F, 3, 2, 4, -0.01F, false));

        this.frontleftleg4 = new AdvancedModelRendererExtended(this);
        this.frontleftleg4.setRotationPoint(4.2164F, 3.1048F, -11.6582F);
        this.upperbody.addChild(frontleftleg4);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0336F, 0.0237F, -0.5F);
        this.frontleftleg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.202F, 0.0829F, -1.0388F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 42, -1.5F, -1.0F, -1.75F, 3, 4, 4, 0.0F, true));

        this.frontleftleg5 = new AdvancedModelRendererExtended(this);
        this.frontleftleg5.setRotationPoint(2.0F, 0.75F, 0.75F);
        this.frontleftleg4.addChild(frontleftleg5);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.283F, 1.919F, 0.2046F);
        this.frontleftleg5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1313F, -0.1321F, -0.0115F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.7176F, -2.1875F, -2.3464F, 2, 5, 3, 0.0F, true));

        this.frontleftleg6 = new AdvancedModelRendererExtended(this);
        this.frontleftleg6.setRotationPoint(0.2515F, 3.5249F, -0.9465F);
        this.frontleftleg5.addChild(frontleftleg6);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-0.5345F, -1.606F, 1.1511F);
        this.frontleftleg6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1313F, -0.1321F, -0.0115F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 46, -1.2176F, 1.8125F, -3.3464F, 3, 2, 4, -0.01F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.9715F, -14.4082F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 24, 30, -3.0F, 0.091F, -3.1666F, 6, 6, 4, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.091F, -2.1666F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 30, -4.0F, 0.0F, -4.0F, 8, 5, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(4.1566F, 4.6005F, -0.7496F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3417F, 0.7786F, -0.0552F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 31, -1.3588F, -0.75F, -0.2066F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-4.1566F, 4.6005F, -0.7496F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3417F, -0.7786F, 0.0552F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 31, 0.3588F, -0.75F, -0.2066F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-1.2293F, 0.2492F, -6.9184F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5565F, -1.5835F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.75F, 1.2508F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 19, -1.0F, -0.5F, 0.75F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(1.2293F, 0.2492F, -6.9184F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.5565F, 1.5835F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 19, 0.0F, -0.5F, 0.75F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-2.8673F, 3.2673F, -6.7755F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4819F, -0.9599F, -0.8138F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 1, -0.75F, 0.0F, -0.75F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(2.0362F, 1.5298F, -8.2257F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.9175F, 0.7124F, 1.0086F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 21, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-2.0362F, 1.5298F, -8.2257F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9175F, -0.7124F, -1.0086F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 21, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(4.1118F, 4.1772F, -3.1994F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.75F, 0.8625F, 0.8564F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 2, -0.75F, -0.5F, -0.25F, 1, 1, 0, 0.0F, true));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-4.1118F, 4.1772F, -3.1994F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.75F, -0.8625F, -0.8564F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 2, -0.25F, -0.5F, -0.25F, 1, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(4.3017F, 1.1014F, -1.9731F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 1.0908F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 19, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-4.3017F, 1.1014F, -1.9731F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, -1.0908F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 19, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(4.2249F, 3.3505F, -0.6034F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.9599F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 4, 8, -1.074F, -1.75F, -0.3642F, 1, 1, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(-4.2249F, 3.3505F, -0.6034F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.9599F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 4, 8, 0.074F, -1.75F, -0.3642F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(3.8055F, 3.6306F, -0.5016F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.7616F, 0.2409F, -1.6811F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 0, -0.5F, 0.25F, -0.5F, 1, 0, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(-3.8055F, 3.6306F, -0.5016F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.7616F, -0.2409F, 1.6811F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 5, 0, -0.5F, 0.25F, -0.5F, 1, 0, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(3.75F, 0.5F, -0.25F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.708F, 0.625F, 0.4296F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 39, -0.5F, -0.6495F, -0.759F, 1, 1, 4, 0.0F, true));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(-3.75F, 0.5F, -0.25F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.708F, -0.625F, -0.4296F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 39, -0.5F, -0.6495F, -0.759F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, 0.1094F, -4.032F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3927F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 39, 35, -2.5F, 0.0316F, -4.7773F, 5, 2, 5, -0.01F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(3.0F, 2.8839F, -4.2555F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2233F, 0.2129F, 0.0479F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 45, 25, -1.5F, -1.8788F, -4.2085F, 2, 3, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(-3.0F, 2.8839F, -4.2555F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2233F, -0.2129F, -0.0479F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 45, -0.5F, -1.8788F, -4.2085F, 2, 3, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2182F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 39, -2.5F, -4.0F, -4.0F, 5, 3, 5, 0.01F, false));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(2.0F, -0.5F, -0.5F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.6109F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 30, -0.5F, -0.25F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 30, -4.5F, -0.25F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 19, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRendererExtended(this);
        this.cube_r34.setRotationPoint(3.4253F, 1.3407F, -5.1462F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5217F, 0.049F, 0.6423F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 6, -0.1253F, -0.7381F, -1.6443F, 0, 1, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRendererExtended(this);
        this.cube_r35.setRotationPoint(-3.4253F, 1.3407F, -5.1462F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.5217F, -0.049F, -0.6423F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 6, 0.1253F, -0.7381F, -1.6443F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRendererExtended(this);
        this.cube_r36.setRotationPoint(2.75F, 0.0F, -2.25F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.3054F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 5, -0.25F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRendererExtended(this);
        this.cube_r37.setRotationPoint(-2.75F, 0.0F, -2.25F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.3054F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 5, 0.25F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 4.0099F, -3.9816F);
        this.head.addChild(jaw);


        this.cube_r38 = new AdvancedModelRendererExtended(this);
        this.cube_r38.setRotationPoint(0.0F, 0.9901F, -0.0184F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 52, 6, -2.5F, -3.25F, -0.75F, 5, 3, 2, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 40, -2.5F, -1.0F, -4.0F, 5, 1, 5, 0.01F, false));

        this.cube_r39 = new AdvancedModelRendererExtended(this);
        this.cube_r39.setRotationPoint(3.0F, -1.126F, -0.2739F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2233F, 0.2129F, 0.0479F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 25, 47, -1.5F, 1.1212F, -4.2085F, 2, 1, 5, 0.0F, false));

        this.cube_r40 = new AdvancedModelRendererExtended(this);
        this.cube_r40.setRotationPoint(-3.0F, -1.126F, -0.2739F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2233F, -0.2129F, -0.0479F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 50, 18, -0.5F, 1.1212F, -4.2085F, 2, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -2.055F, -10.5524F);
        this.upperbody.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.25F, -0.8255F, -0.0224F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 3.25F, -0.8255F, -0.0224F, 0, 1, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 0.0F, -1.0755F, -0.0224F, 0, 1, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 0.0F, -1.0755F, 3.4776F, 0, 1, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 0.0F, -1.0755F, 6.9776F, 0, 1, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.25F, -0.8255F, 3.4776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 3.25F, -0.8255F, 3.4776F, 0, 1, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.25F, -0.8255F, 6.9776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 3.25F, -0.8255F, 6.9776F, 0, 1, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -0.3201F, -0.2981F, 10, 8, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.elginia.render(f5 * 0.42f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.elginia.offsetY = 0.85F;

        EntityPrehistoricFloraElginia Elginia = (EntityPrehistoricFloraElginia) e;
        float masterSpeed = Elginia.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3};

        // || (Elginia.moveStrafing == 0 && Elginia.moveVertical == 0 && Elginia.moveForward == 0)

        if (Elginia.getAnimation() == Elginia.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Elginia.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (Elginia.getIsFast()) {
            speed = speed * 2;
        }

        this.frontleftleg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 1, f2, 1.5F);;
        this.frontrightleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 4, f2, 1.5F);;
        this.backleftleg5.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 4, f2, 1.5F);;
        this.backrightleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 1, f2, 1.5F);;

        this.flap(frontleftleg4, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(frontrightleg, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(backleftleg5, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(backrightleg, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(frontleftleg4, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(frontrightleg, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(backleftleg5, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(backrightleg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(frontleftleg5, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(frontrightleg2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(backleftleg5, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(backrightleg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(frontleftleg5, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(frontrightleg2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(backleftleg5, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(backrightleg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(frontleftleg6, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(frontrightleg3, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(backleftleg6, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(backrightleg3, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(elginia, speed * 2F, 0.185F, false, 2.5F,  f2, 1F);

        this.flap(lowerbody, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(elginia, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperbody, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(upperbody, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.elginia.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraElginia e = (EntityPrehistoricFloraElginia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.tail, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
