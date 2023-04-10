package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBunostegos;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelBunostegos extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended bunostegos;
    private final AdvancedModelRendererExtended lowerbody;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended backleftleg4;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended backleftleg5;
    private final AdvancedModelRendererExtended backleftleg6;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended frontrightleg4;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended frontrightleg5;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended frontrightleg6;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended frontleftleg7;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cheekbone;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cheekbone2;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended body;

    private ModelAnimator animator;

    public ModelBunostegos() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bunostegos = new AdvancedModelRendererExtended(this);
        this.bunostegos.setRotationPoint(0.0F, 17.75F, -1.0F);


        this.lowerbody = new AdvancedModelRendererExtended(this);
        this.lowerbody.setRotationPoint(0.0F, -7.65F, 8.0F);
        this.bunostegos.addChild(lowerbody);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 24, -4.0F, -3.0F, 0.0F, 8, 11, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.9F, -3.35F, 1.5F);
        this.lowerbody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 69, 0.25F, 0.25F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 69, 1.55F, 0.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 69, 3.3F, 0.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 69, -1.5F, 0.25F, 0.0F, 0, 1, 5, 0.0F, false));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-4.3556F, 5.2722F, 2.411F);
        this.lowerbody.addChild(backrightleg);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-1.1444F, -1.7722F, -0.411F);
        this.backrightleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3098F, 0.2685F, 0.243F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 52, -1.25F, -1.5F, -1.5F, 3, 6, 5, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(-1.6444F, 0.7278F, -0.661F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.1309F, 0.0F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 18, 56, -1.5F, 1.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.1309F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 40, 44, -2.5F, 0.0F, -3.0F, 5, 2, 6, 0.0F, false));

        this.backleftleg4 = new AdvancedModelRendererExtended(this);
        this.backleftleg4.setRotationPoint(4.3556F, 5.2722F, 2.411F);
        this.lowerbody.addChild(backleftleg4);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.1444F, -1.7722F, -0.411F);
        this.backleftleg4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3098F, -0.2685F, -0.243F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 52, -1.75F, -1.5F, -1.5F, 3, 6, 5, 0.0F, true));

        this.backleftleg5 = new AdvancedModelRendererExtended(this);
        this.backleftleg5.setRotationPoint(1.6444F, 0.7278F, -0.661F);
        this.backleftleg4.addChild(backleftleg5);
        this.setRotateAngle(backleftleg5, 0.1309F, 0.0F, 0.0F);
        this.backleftleg5.cubeList.add(new ModelBox(backleftleg5, 18, 56, -1.5F, 1.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.backleftleg6 = new AdvancedModelRendererExtended(this);
        this.backleftleg6.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.backleftleg5.addChild(backleftleg6);
        this.setRotateAngle(backleftleg6, -0.1309F, 0.0F, 0.0F);
        this.backleftleg6.cubeList.add(new ModelBox(backleftleg6, 40, 44, -2.5F, 0.0F, -3.0F, 5, 2, 6, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -0.9544F, 6.0224F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 44, 8, -3.0F, -0.6888F, -0.3691F, 6, 7, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.2635F, 3.5803F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 52, 19, -2.0F, -0.5512F, -1.3276F, 4, 5, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.4488F, 3.1724F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 61, -1.0F, -0.5F, -0.5F, 2, 3, 5, 0.0F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.5F, -0.1F, -11.0F);
        this.lowerbody.addChild(upperbody);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.5F, -2.5F, -0.5F);
        this.upperbody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -4.5F, -0.25F, -5.5F, 9, 11, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-3.5F, -3.0F, -3.0F);
        this.upperbody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 69, 2.0F, -0.25F, -2.75F, 0, 1, 5, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 69, 4.0F, -0.25F, -2.75F, 0, 1, 5, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 69, 6.0F, 0.0F, -2.75F, 0, 1, 5, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 69, 0.0F, 0.0F, -2.75F, 0, 1, 5, 0.0F, false));

        this.frontrightleg4 = new AdvancedModelRendererExtended(this);
        this.frontrightleg4.setRotationPoint(-5.0982F, 5.9496F, -1.6008F);
        this.upperbody.addChild(frontrightleg4);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0982F, -1.1996F, 0.6008F);
        this.frontrightleg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.035F, 0.2595F, -0.3009F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 41, -5.1263F, -1.5179F, -3.7037F, 6, 4, 5, 0.0F, false));

        this.frontrightleg5 = new AdvancedModelRendererExtended(this);
        this.frontrightleg5.setRotationPoint(-3.4018F, 1.4867F, 0.9371F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.1309F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, -0.6863F, 0.1637F);
        this.frontrightleg5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 58, -2.0F, -0.5F, -2.25F, 3, 6, 4, -0.01F, false));

        this.frontrightleg6 = new AdvancedModelRendererExtended(this);
        this.frontrightleg6.setRotationPoint(0.0F, 4.5373F, -1.5062F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, 0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.frontrightleg6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 36, -2.5F, -1.0F, -2.5F, 5, 2, 5, -0.01F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(4.0982F, 5.9496F, -1.6008F);
        this.upperbody.addChild(frontleftleg);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.0982F, -1.1996F, 0.6008F);
        this.frontleftleg.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.035F, -0.2595F, 0.3009F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 41, -0.8737F, -1.5179F, -3.7037F, 6, 4, 5, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(3.4018F, 1.4867F, 0.9371F);
        this.frontleftleg.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1309F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.6863F, 0.1637F);
        this.frontleftleg3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 58, -1.0F, -0.5F, -2.25F, 3, 6, 4, -0.01F, true));

        this.frontleftleg7 = new AdvancedModelRendererExtended(this);
        this.frontleftleg7.setRotationPoint(0.0F, 4.5373F, -1.5062F);
        this.frontleftleg3.addChild(frontleftleg7);
        this.setRotateAngle(frontleftleg7, 0.1745F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.frontleftleg7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 53, 36, -2.5F, -1.0F, -2.5F, 5, 2, 5, -0.01F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(-0.5F, -1.5622F, -5.7246F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.3491F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 41, -3.0F, -0.1587F, -5.0073F, 6, 7, 6, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.4895F, 0.5604F, -3.3059F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 0, -3.5105F, -0.9691F, -3.7014F, 8, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 8, -3.2605F, -1.7191F, -3.7014F, 2, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 8, 2.2395F, -1.7191F, -3.7014F, 2, 1, 2, -0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 54, -2.0105F, 0.0452F, -7.2014F, 5, 3, 4, 0.01F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(3.4895F, 1.556F, -3.7233F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3042F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.3789F, -1.5107F, -3.2613F, 2, 3, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-2.5105F, 1.556F, -3.7233F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3042F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 29, -0.6211F, -1.5107F, -3.2613F, 2, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.4895F, -0.7096F, -3.8545F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 52, -2.5F, -0.0446F, -3.2927F, 5, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(1.4895F, -0.1741F, -6.3486F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3806F, -0.0992F, 0.2427F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.25F, -1.25F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-0.5105F, -0.1741F, -6.3486F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3806F, 0.0992F, -0.2427F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -1.25F, -1.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(3.9895F, -1.9691F, -0.7014F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3778F, 0.1105F, 0.2858F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 19, -1.25F, -0.75F, -0.25F, 2, 3, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-3.0105F, -1.9691F, -0.7014F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3778F, -0.1105F, -0.2858F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 19, -0.75F, -0.75F, -0.25F, 2, 3, 2, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.4895F, 3.0407F, 0.3169F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 50, -4.0F, -0.0099F, -4.0184F, 8, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 41, 1.75F, -2.0099F, -3.0184F, 2, 2, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 41, -3.75F, -2.0099F, -3.0184F, 2, 2, 3, -0.01F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 0, -2.5F, 0.0045F, -7.5184F, 5, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 24, -0.25F, -2.2599F, -4.5184F, 3, 3, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 24, -2.75F, -2.2599F, -4.5184F, 3, 3, 3, -0.01F, true));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(3.0F, -1.4848F, -4.0402F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3042F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 62, -1.3789F, 1.4893F, -3.2613F, 2, 2, 4, -0.01F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-3.0F, -1.4848F, -4.0402F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3042F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 63, -0.6211F, 1.4893F, -3.2613F, 2, 2, 4, -0.01F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(3.5F, 1.4901F, -3.5184F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6545F, 0.0F, -0.5236F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 24, -0.75F, -0.75F, -0.25F, 1, 3, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(-3.5F, 1.4901F, -3.5184F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6545F, 0.0F, 0.5236F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 24, -0.25F, -0.75F, -0.25F, 1, 3, 2, 0.0F, false));

        this.cheekbone = new AdvancedModelRendererExtended(this);
        this.cheekbone.setRotationPoint(-3.5105F, 1.7809F, -2.2014F);
        this.head.addChild(cheekbone);
        this.setRotateAngle(cheekbone, 0.0287F, 0.2267F, -0.1291F);


        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-1.3554F, 1.1895F, 0.0F);
        this.cheekbone.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.6545F, -0.5672F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 7, -1.7037F, -0.8007F, -1.25F, 3, 1, 3, -0.01F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.cheekbone.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.3054F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 43, -0.5F, -0.75F, -2.0F, 3, 2, 5, -0.01F, false));

        this.cheekbone2 = new AdvancedModelRendererExtended(this);
        this.cheekbone2.setRotationPoint(4.4895F, 1.7809F, -2.2014F);
        this.head.addChild(cheekbone2);
        this.setRotateAngle(cheekbone2, 0.0287F, -0.2267F, 0.1291F);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(1.3554F, 1.1895F, 0.0F);
        this.cheekbone2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.6545F, 0.5672F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 7, -1.2963F, -0.8007F, -1.25F, 3, 1, 3, -0.01F, true));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.cheekbone2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.3054F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 56, 43, -2.5F, -0.75F, -2.0F, 3, 2, 5, -0.01F, true));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(-0.5F, 8.0F, 3.0F);
        this.upperbody.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -11.0F, -3.5F, 10, 12, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 2, 62, -3.0F, -11.5F, -3.5F, 0, 1, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 2, 62, 3.0F, -11.5F, -3.5F, 0, 1, 12, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 2, 62, 0.9F, -11.75F, -3.5F, 0, 1, 12, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 2, 62, -0.9F, -11.75F, -3.5F, 0, 1, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bunostegos.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.jaw.rotateAngleX = (float) Math.toRadians(23);
        this.neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.bunostegos.offsetY = 0.1F;

        EntityPrehistoricFloraBunostegos Bunostegos = (EntityPrehistoricFloraBunostegos) e;
        float masterSpeed = Bunostegos.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3};

        // || (Bunostegos.moveStrafing == 0 && Bunostegos.moveVertical == 0 && Bunostegos.moveForward == 0)

        if (Bunostegos.getAnimation() == Bunostegos.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Bunostegos.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (Bunostegos.getIsFast()) {
            speed = speed * 2;
        }

        this.frontleftleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 1, f2, 1.5F);;
        this.frontrightleg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.85), false, 4, f2, 1.5F);;
        this.backleftleg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 4, f2, 1.5F);;
        this.backrightleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.65), false, 1, f2, 1.5F);;

        this.flap(frontleftleg, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(frontrightleg4, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(backleftleg4, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(backrightleg, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(frontleftleg, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(frontrightleg4, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(backleftleg4, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(backrightleg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(frontleftleg3, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(frontrightleg5, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(backleftleg5, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(backrightleg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(frontleftleg3, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(frontrightleg5, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(backleftleg5, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(backrightleg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(frontleftleg7, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(frontrightleg6, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(backleftleg6, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(backrightleg3, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(bunostegos, speed * 2F, 0.185F, false, 2.5F,  f2, 1F);

        this.flap(lowerbody, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperbody, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(upperbody, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.bunostegos.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBunostegos e = (EntityPrehistoricFloraBunostegos) entity;
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
