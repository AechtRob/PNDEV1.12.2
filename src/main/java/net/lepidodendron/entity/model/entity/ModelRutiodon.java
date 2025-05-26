package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRutiodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRutiodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer backleftlegw;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2w;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backleftleg4;
    private final AdvancedModelRenderer backrightlegw;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2w;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontleftlegw;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontleftleg4;
    private final AdvancedModelRenderer frontrightlegw;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontrightleg4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelRutiodon() {
        this.textureWidth = 74;
        this.textureHeight = 74;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 16.25F, 9.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.0314F, -0.5009F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0742F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 17, -2.0F, -0.225F, -0.05F, 4, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0064F, 2.4991F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 25, -0.5F, -0.5F, -3.0F, 1, 1, 6, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.1814F, 2.4991F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 20, -3.0F, -2.0F, -3.0F, 6, 4, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0314F, 2.7491F);
        this.root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 59, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 59, 4.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3564F, 4.824F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, -0.2531F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -2.5F, -0.1F, 0.0F, 5, 4, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 52, 63, 1.5F, -0.6F, 0.75F, 0, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 52, 63, -1.5F, -0.6F, 0.75F, 0, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 5, -0.5F, -0.125F, -2.5F, 1, 1, 5, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.225F, 4.575F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2051F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 42, -2.0F, -0.1F, 0.0F, 4, 3, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 38, 1.0F, -0.6F, 0.75F, 0, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 38, -1.0F, -0.6F, 0.75F, 0, 1, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 45, -0.5F, -0.05F, -2.5F, 1, 1, 5, -0.02F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.35F, 4.85F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 41, -1.5F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 57, 52, 1.0F, -0.5F, 0.5F, 0, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 57, 52, -1.0F, -0.5F, 0.5F, 0, 1, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 53, 0.0F, 0.125F, -3.0F, 0, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 5.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2967F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 31, -1.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 53, 33, 0.5F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 53, 33, -0.5F, -0.5F, 0.0F, 0, 1, 6, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.85F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 36, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 7, 62, 0.0F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backleftlegw = new AdvancedModelRenderer(this);
        this.backleftlegw.setRotationPoint(2.825F, 3.1064F, 1.1491F);
        this.root.addChild(backleftlegw);


        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(0.0F, 0.175F, 0.0F);
        this.backleftlegw.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0466F, -0.9597F, -0.0132F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 13, 45, -1.0F, -1.0F, -5.0F, 2, 2, 6, 0.001F, false));

        this.backleftleg2w = new AdvancedModelRenderer(this);
        this.backleftleg2w.setRotationPoint(0.0113F, -0.0439F, -4.7153F);
        this.backleftleg.addChild(backleftleg2w);


        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backleftleg2w.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.2182F, 0.5672F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 64, 12, -1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.025F, 1.9F, 0.1F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0F, 0.3054F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 7, 36, -0.95F, 0.2729F, -0.7904F, 2, 2, 1, -0.001F, false));

        this.backleftleg4 = new AdvancedModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.0F, 1.9979F, -0.2904F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, -0.1308F, -0.0205F, -0.04F);
        this.backleftleg4.cubeList.add(new ModelBox(backleftleg4, 24, 0, -1.5F, 0.0F, -3.25F, 3, 1, 4, 0.0F, false));

        this.backrightlegw = new AdvancedModelRenderer(this);
        this.backrightlegw.setRotationPoint(-2.825F, 2.9314F, 1.1491F);
        this.root.addChild(backrightlegw);


        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(0.0F, 0.35F, 0.0F);
        this.backrightlegw.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.0466F, 0.9597F, 0.0132F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 13, 45, -1.0F, -1.0F, -5.0F, 2, 2, 6, 0.001F, true));

        this.backrightleg2w = new AdvancedModelRenderer(this);
        this.backrightleg2w.setRotationPoint(-0.0113F, -0.0439F, -4.7153F);
        this.backrightleg.addChild(backrightleg2w);


        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backrightleg2w.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.2182F, -0.5672F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 64, 12, -1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.025F, 1.9F, 0.1F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0F, -0.3054F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 7, 36, -1.05F, 0.2729F, -0.7904F, 2, 2, 1, -0.001F, true));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(0.0F, 1.9979F, -0.2904F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.1308F, 0.0205F, 0.04F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 24, 0, -1.5F, 0.0F, -3.25F, 3, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -0.025F, -9.0F, 7, 5, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 31, 1.5F, -0.525F, -9.0F, 0, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 31, -2.5F, -0.525F, -9.0F, 0, 1, 9, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 24, 6, -1.5F, -0.675F, -9.0F, 2, 1, 9, 0.001F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(-0.5F, 0.125F, -8.725F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0436F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 15, -3.0F, -0.136F, -5.8242F, 6, 4, 6, 0.0F, false));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 59, 2.0F, -0.636F, -5.3242F, 0, 1, 5, 0.0F, false));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 59, -2.0F, -0.636F, -5.3242F, 0, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.464F, -2.8242F);
        this.upperbody.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, -2.0F, -1.125F, -3.0F, 4, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.036F, -2.8242F);
        this.upperbody.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 51, -0.5F, -0.575F, -3.0F, 1, 1, 6, 0.0F, false));

        this.frontleftlegw = new AdvancedModelRenderer(this);
        this.frontleftlegw.setRotationPoint(2.175F, 3.064F, -3.3742F);
        this.upperbody.addChild(frontleftlegw);


        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftlegw.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.5251F, 1.1243F, 0.4815F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.25F, 0.0F, 0.0F);
        this.frontleftleg.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 45, -2.0F, -1.225F, -1.0F, 2, 2, 6, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.25F, 0.0F, 3.725F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, 0.0436F, -0.3927F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 47, 61, -1.0F, 0.0F, -0.75F, 2, 3, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.2959F, 2.4081F, 0.258F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.2628F, 0.0843F, -0.0226F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 19, 15, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.frontleftleg4 = new AdvancedModelRenderer(this);
        this.frontleftleg4.setRotationPoint(0.075F, 1.4F, 0.0F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, 0.1745F, 0.2182F, 0.1745F);
        this.frontleftleg4.cubeList.add(new ModelBox(frontleftleg4, 53, 0, -0.7211F, 0.1005F, -1.6801F, 4, 1, 3, 0.0F, false));

        this.frontrightlegw = new AdvancedModelRenderer(this);
        this.frontrightlegw.setRotationPoint(-2.175F, 3.064F, -3.3742F);
        this.upperbody.addChild(frontrightlegw);


        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightlegw.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.5251F, -1.1243F, -0.4815F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.25F, 0.0F, 0.0F);
        this.frontrightleg.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 45, 0.0F, -1.225F, -1.0F, 2, 2, 6, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.25F, 0.0F, 3.725F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, -0.0436F, 0.3927F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 47, 61, -1.0F, 0.0F, -0.75F, 2, 3, 2, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-0.2959F, 2.4081F, 0.258F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.2628F, -0.0843F, 0.0226F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 19, 15, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.frontrightleg4 = new AdvancedModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-0.075F, 1.4F, 0.0F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.1745F, -0.2182F, -0.1745F);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 53, 0, -3.2789F, 0.1005F, -1.6801F, 4, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.464F, -5.3242F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 44, 41, -2.0F, -1.5F, -3.0F, 4, 4, 4, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, 1.0F, -2.0F, -3.0F, 0, 1, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, -1.0F, -2.0F, -3.0F, 0, 1, 4, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 8, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.2F, -1.5F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 59, -1.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 53, 17, -2.0F, -0.6F, -2.075F, 4, 2, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 6, -1.5F, 0.4F, -3.0F, 3, 1, 1, -0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 31, -0.5F, -0.5331F, -4.1008F, 1, 1, 1, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7746F, -3.9508F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 36, -0.5F, -0.0264F, -2.0437F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.8996F, -2.7663F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 55, -1.0F, -0.0224F, -1.2388F, 2, 2, 4, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.15F, 0.2F, -2.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 17, -1.25F, -0.65F, -0.425F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 17, 0.55F, -0.65F, -0.425F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1272F, -0.5211F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 50, -1.5F, -0.1272F, -2.4789F, 3, 1, 3, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 22, -1.0F, -0.7772F, -2.3289F, 2, 1, 3, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 59, -1.0F, -1.4772F, -2.3289F, 2, 1, 3, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.1272F, -1.9789F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 25, -0.375F, -0.4762F, -10.6993F, 0, 1, 8, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 25, 0.375F, -0.4762F, -10.6993F, 0, 1, 8, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 31, -0.5F, 0.0238F, -10.6993F, 1, 1, 8, -0.003F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 33, -1.0F, 0.0238F, -2.6993F, 2, 1, 3, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.375F, 0.0151F, -4.6724F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0732F, -0.3047F, -0.022F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, 0.0F, -0.4303F, -0.0024F, 0, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.375F, 0.0151F, -4.6724F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0732F, 0.3047F, 0.022F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 26, 0.0F, -0.4303F, -0.0024F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.9728F, -1.7789F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 0, -1.0F, -1.0653F, -0.147F, 2, 1, 2, -0.01F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.4F, -3.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0524F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 60, 59, -1.0F, 0.0F, -2.25F, 2, 1, 3, 0.001F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 47, 8, -0.5F, 0.0F, -9.25F, 1, 1, 7, 0.001F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 41, 50, 0.45F, 0.5F, -9.25F, 0, 1, 7, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 41, 50, -0.45F, 0.5F, -9.25F, 0, 1, 7, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.1034F, -9.9615F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 0, -0.75F, 0.4849F, -1.1488F, 0, 1, 1, -0.001F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 0, 0.75F, 0.4849F, -1.1488F, 0, 1, 1, -0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 6, -1.0F, -0.0151F, -1.1488F, 2, 1, 1, -0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.45F, 1.0F, -2.25F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.2182F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 15, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.45F, 0.9512F, -9.6983F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0701F, -0.0871F, 0.0061F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 31, 17, -0.5F, -1.0F, -1.2F, 1, 1, 1, 0.002F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.45F, 1.0F, -2.25F);
        this.upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2182F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 15, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.0F;
        this.root.offsetX = 0.2F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleX = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.105F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraRutiodon entityRutiodon = (EntityPrehistoricFloraRutiodon) e;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, neck2, this.head};
        entityRutiodon.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityRutiodon.getAnimation() == entityRutiodon.LAY_ANIMATION || entityRutiodon.getAnimation() == entityRutiodon.STAND_ANIMATION) {
            this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);

        }
        else {
            if (!entityRutiodon.isReallyInWater()) {

                if (f3 == 0.0F || !entityRutiodon.getIsMoving()) {
                    if (entityRutiodon.getAnimation() != entityRutiodon.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityRutiodon.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.body.setScale(1,1,1);
        this.upperbody.setScale(1,1,1);

        EntityPrehistoricFloraRutiodon ee = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.16377-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.94969-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.33387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 12.16377 + (((tickAnim - 5) / 4) * (16.84014-(12.16377)));
            yy = -7.94969 + (((tickAnim - 5) / 4) * (-8.51315-(-7.94969)));
            zz = -0.33387 + (((tickAnim - 5) / 4) * (-3.31117-(-0.33387)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 16.84014 + (((tickAnim - 9) / 7) * (-10.25-(16.84014)));
            yy = -8.51315 + (((tickAnim - 9) / 7) * (0-(-8.51315)));
            zz = -3.31117 + (((tickAnim - 9) / 7) * (0-(-3.31117)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.25 + (((tickAnim - 16) / 3) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 19) / 4) * (-10.19686-(-10.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (-1.53568-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-3.96333-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.19686 + (((tickAnim - 23) / 4) * (-15.84843-(-10.19686)));
            yy = -1.53568 + (((tickAnim - 23) / 4) * (-0.76784-(-1.53568)));
            zz = -3.96333 + (((tickAnim - 23) / 4) * (-1.98166-(-3.96333)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -15.84843 + (((tickAnim - 27) / 3) * (-15.34843-(-15.84843)));
            yy = -0.76784 + (((tickAnim - 27) / 3) * (-0.76784-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 27) / 3) * (-1.98166-(-1.98166)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15.34843 + (((tickAnim - 30) / 5) * (0-(-15.34843)));
            yy = -0.76784 + (((tickAnim - 30) / 5) * (0-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 30) / 5) * (0-(-1.98166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = -13.5 + (((tickAnim - 5) / 30) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.89347-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.03535-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.75415-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.89347 + (((tickAnim - 5) / 4) * (11.48596-(4.89347)));
            yy = 14.03535 + (((tickAnim - 5) / 4) * (17.04317-(14.03535)));
            zz = -2.75415 + (((tickAnim - 5) / 4) * (-1.4762-(-2.75415)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.48596 + (((tickAnim - 9) / 3) * (13.28126-(11.48596)));
            yy = 17.04317 + (((tickAnim - 9) / 3) * (9.94947-(17.04317)));
            zz = -1.4762 + (((tickAnim - 9) / 3) * (-5.56616-(-1.4762)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 13.28126 + (((tickAnim - 12) / 2) * (-8.78697-(13.28126)));
            yy = 9.94947 + (((tickAnim - 12) / 2) * (7.5849-(9.94947)));
            zz = -5.56616 + (((tickAnim - 12) / 2) * (-6.92949-(-5.56616)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.78697 + (((tickAnim - 14) / 4) * (1-(-8.78697)));
            yy = 7.5849 + (((tickAnim - 14) / 4) * (0-(7.5849)));
            zz = -6.92949 + (((tickAnim - 14) / 4) * (0-(-6.92949)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (-9.23527-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.37617-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-4.48428-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -9.23527 + (((tickAnim - 23) / 4) * (-0.24264-(-9.23527)));
            yy = -0.37617 + (((tickAnim - 23) / 4) * (-0.18808-(-0.37617)));
            zz = -4.48428 + (((tickAnim - 23) / 4) * (-2.24214-(-4.48428)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.24264 + (((tickAnim - 27) / 3) * (-0.24264-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 27) / 3) * (-0.18808-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 27) / 3) * (-2.24214-(-2.24214)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.24264 + (((tickAnim - 30) / 5) * (0-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 30) / 5) * (0-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 30) / 5) * (0-(-2.24214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 5) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 19.5 + (((tickAnim - 14) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 19.5 + (((tickAnim - 22) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -2.825 + (((tickAnim - 20) / 10) * (-2.825-(-2.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -2.825 + (((tickAnim - 30) / 20) * (0-(-2.825)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.75 + (((tickAnim - 20) / 10) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 30) / 20) * (0-(4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 20) / 10) * (11-(11)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 30) / 20) * (0-(11)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -18.75 + (((tickAnim - 20) / 10) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 30) / 20) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.25 + (((tickAnim - 20) / 10) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.25 + (((tickAnim - 30) / 20) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (22-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.5 + (((tickAnim - 20) / 10) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 22 + (((tickAnim - 20) / 10) * (22-(22)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 30) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 22 + (((tickAnim - 30) / 20) * (0-(22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.25 + (((tickAnim - 20) / 10) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.25 + (((tickAnim - 30) / 20) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-22-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.5 + (((tickAnim - 20) / 10) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -22 + (((tickAnim - 20) / 10) * (-22-(-22)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 30) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -22 + (((tickAnim - 30) / 20) * (0-(-22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (29-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 30) / 20) * (0-(29)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22 + (((tickAnim - 20) / 10) * (22-(22)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 30) / 20) * (0-(22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -23.5 + (((tickAnim - 20) / 10) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 30) / 20) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29.37322-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.24985-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.90085-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.37322 + (((tickAnim - 20) / 10) * (-29.37322-(-29.37322)));
            yy = -3.24985 + (((tickAnim - 20) / 10) * (-3.24985-(-3.24985)));
            zz = -9.90085 + (((tickAnim - 20) / 10) * (-9.90085-(-9.90085)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.37322 + (((tickAnim - 30) / 20) * (0-(-29.37322)));
            yy = -3.24985 + (((tickAnim - 30) / 20) * (0-(-3.24985)));
            zz = -9.90085 + (((tickAnim - 30) / 20) * (0-(-9.90085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (29-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 30) / 20) * (0-(29)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22 + (((tickAnim - 20) / 10) * (22-(22)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 30) / 20) * (0-(22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -23.5 + (((tickAnim - 20) / 10) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 30) / 20) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29.37322-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.24985-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (9.90085-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.37322 + (((tickAnim - 20) / 10) * (-29.37322-(-29.37322)));
            yy = 3.24985 + (((tickAnim - 20) / 10) * (3.24985-(3.24985)));
            zz = 9.90085 + (((tickAnim - 20) / 10) * (9.90085-(9.90085)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.37322 + (((tickAnim - 30) / 20) * (0-(-29.37322)));
            yy = 3.24985 + (((tickAnim - 30) / 20) * (0-(3.24985)));
            zz = 9.90085 + (((tickAnim - 30) / 20) * (0-(9.90085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (167-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-16.02334-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-180-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 167 + (((tickAnim - 25) / 25) * (0-(167)));
            yy = -16.02334 + (((tickAnim - 25) / 25) * (0-(-16.02334)));
            zz = -180 + (((tickAnim - 25) / 25) * (0-(-180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (56.71589-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (29.4845-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (44.07126-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 56.71589 + (((tickAnim - 25) / 13) * (-30.1589-(56.71589)));
            yy = 29.4845 + (((tickAnim - 25) / 13) * (23.1571-(29.4845)));
            zz = 44.07126 + (((tickAnim - 25) / 13) * (-48.74624-(44.07126)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -30.1589 + (((tickAnim - 38) / 12) * (0-(-30.1589)));
            yy = 23.1571 + (((tickAnim - 38) / 12) * (0-(23.1571)));
            zz = -48.74624 + (((tickAnim - 38) / 12) * (0-(-48.74624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (44.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 44.75 + (((tickAnim - 25) / 7) * (-5.31-(44.75)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -5.31 + (((tickAnim - 32) / 6) * (-90.62-(-5.31)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -90.62 + (((tickAnim - 38) / 7) * (-81.09-(-90.62)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -81.09 + (((tickAnim - 45) / 5) * (0-(-81.09)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.675 + (((tickAnim - 38) / 12) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (61.25-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 61.25 + (((tickAnim - 25) / 13) * (92.58-(61.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 92.58 + (((tickAnim - 38) / 7) * (69.93-(92.58)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 69.93 + (((tickAnim - 45) / 5) * (0-(69.93)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (1.25-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.25 + (((tickAnim - 32) / 18) * (0-(1.25)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 660;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -0.75 + (((tickAnim - 35) / 575) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -0.75 + (((tickAnim - 610) / 50) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = -3.5 + (((tickAnim - 35) / 575) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = -3.5 + (((tickAnim - 610) / 50) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 13.25 + (((tickAnim - 35) / 575) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 13.25 + (((tickAnim - 610) / 50) * (0-(13.25)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 3.75 + (((tickAnim - 35) / 575) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 3.75 + (((tickAnim - 610) / 50) * (0-(3.75)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -17.25 + (((tickAnim - 35) / 575) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -17.25 + (((tickAnim - 610) / 50) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -25.75 + (((tickAnim - 35) / 575) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -25.75 + (((tickAnim - 610) / 50) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-31.54862-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-10.19462-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-24.51306-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -31.54862 + (((tickAnim - 35) / 575) * (-31.54862-(-31.54862)));
            yy = -10.19462 + (((tickAnim - 35) / 575) * (-10.19462-(-10.19462)));
            zz = -24.51306 + (((tickAnim - 35) / 575) * (-24.51306-(-24.51306)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -31.54862 + (((tickAnim - 610) / 50) * (0-(-31.54862)));
            yy = -10.19462 + (((tickAnim - 610) / 50) * (0-(-10.19462)));
            zz = -24.51306 + (((tickAnim - 610) / 50) * (0-(-24.51306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.3-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 575) * (0.425-(0.425)));
            zz = 0.3 + (((tickAnim - 35) / 575) * (0.3-(0.3)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 0.425 + (((tickAnim - 610) / 50) * (0-(0.425)));
            zz = 0.3 + (((tickAnim - 610) / 50) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (21-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 21 + (((tickAnim - 35) / 575) * (21-(21)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 21 + (((tickAnim - 610) / 50) * (0-(21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (24.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 34 + (((tickAnim - 35) / 575) * (34-(34)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 24.5 + (((tickAnim - 35) / 575) * (24.5-(24.5)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 34 + (((tickAnim - 610) / 50) * (0-(34)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 24.5 + (((tickAnim - 610) / 50) * (0-(24.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -25.75 + (((tickAnim - 35) / 575) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -25.75 + (((tickAnim - 610) / 50) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-31.54862-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (10.19462-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (24.51306-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -31.54862 + (((tickAnim - 35) / 575) * (-31.54862-(-31.54862)));
            yy = 10.19462 + (((tickAnim - 35) / 575) * (10.19462-(10.19462)));
            zz = 24.51306 + (((tickAnim - 35) / 575) * (24.51306-(24.51306)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -31.54862 + (((tickAnim - 610) / 50) * (0-(-31.54862)));
            yy = 10.19462 + (((tickAnim - 610) / 50) * (0-(10.19462)));
            zz = 24.51306 + (((tickAnim - 610) / 50) * (0-(24.51306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.3-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 575) * (0.425-(0.425)));
            zz = 0.3 + (((tickAnim - 35) / 575) * (0.3-(0.3)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 0.425 + (((tickAnim - 610) / 50) * (0-(0.425)));
            zz = 0.3 + (((tickAnim - 610) / 50) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-21-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = -21 + (((tickAnim - 35) / 575) * (-21-(-21)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = -21 + (((tickAnim - 610) / 50) * (0-(-21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(0);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(0);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-24.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 34 + (((tickAnim - 35) / 575) * (34-(34)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = -24.5 + (((tickAnim - 35) / 575) * (-24.5-(-24.5)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 34 + (((tickAnim - 610) / 50) * (0-(34)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = -24.5 + (((tickAnim - 610) / 50) * (0-(-24.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(0);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(0);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(0);



        if (tickAnim >= 35 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 35) / 45) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01-(1)));
            yy = 1 + (((tickAnim - 35) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 45) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01 + (((tickAnim - 80) / 520) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01)));
            yy = 1 + (((tickAnim - 80) / 520) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 520) * (1-(1)));
        }
        else if (tickAnim >= 600 && tickAnim < 660) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01 + (((tickAnim - 600) / 60) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01)));
            yy = 1 + (((tickAnim - 600) / 60) * (1-(1)));
            zz = 1 + (((tickAnim - 600) / 60) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 35 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 35) / 45) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.01-(1)));
            yy = 1 + (((tickAnim - 35) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 45) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.01 + (((tickAnim - 80) / 520) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.01)));
            yy = 1 + (((tickAnim - 80) / 520) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 520) * (1-(1)));
        }
        else if (tickAnim >= 600 && tickAnim < 660) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.01 + (((tickAnim - 600) / 60) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.01)));
            yy = 1 + (((tickAnim - 600) / 60) * (1-(1)));
            zz = 1 + (((tickAnim - 600) / 60) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.upperbody.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 10.25 + (((tickAnim - 35) / 575) * (10.25-(10.25)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 10.25 + (((tickAnim - 610) / 50) * (0-(10.25)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 660) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-60.75-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = -60.75 + (((tickAnim - 35) / 575) * (-60.75-(-60.75)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = -60.75 + (((tickAnim - 610) / 50) * (0-(-60.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 660) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 660) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-12.50612-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.09798-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (61.10735-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -12.50612 + (((tickAnim - 35) / 575) * (-12.50612-(-12.50612)));
            yy = -0.09798 + (((tickAnim - 35) / 575) * (-0.09798-(-0.09798)));
            zz = 61.10735 + (((tickAnim - 35) / 575) * (61.10735-(61.10735)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -12.50612 + (((tickAnim - 610) / 50) * (0-(-12.50612)));
            yy = -0.09798 + (((tickAnim - 610) / 50) * (0-(-0.09798)));
            zz = 61.10735 + (((tickAnim - 610) / 50) * (0-(61.10735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 660) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 660) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(xx);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(yy);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = -10.25 + (((tickAnim - 35) / 575) * (-10.25-(-10.25)));
            zz = 0 + (((tickAnim - 35) / 575) * (0-(0)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = -10.25 + (((tickAnim - 610) / 50) * (0-(-10.25)));
            zz = 0 + (((tickAnim - 610) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (60.75-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 575) * (0-(0)));
            zz = 60.75 + (((tickAnim - 35) / 575) * (60.75-(60.75)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 610) / 50) * (0-(0)));
            zz = 60.75 + (((tickAnim - 610) / 50) * (0-(60.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-12.50612-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.09798-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-61.10735-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 610) {
            xx = -12.50612 + (((tickAnim - 35) / 575) * (-12.50612-(-12.50612)));
            yy = 0.09798 + (((tickAnim - 35) / 575) * (0.09798-(0.09798)));
            zz = -61.10735 + (((tickAnim - 35) / 575) * (-61.10735-(-61.10735)));
        }
        else if (tickAnim >= 610 && tickAnim < 660) {
            xx = -12.50612 + (((tickAnim - 610) / 50) * (0-(-12.50612)));
            yy = 0.09798 + (((tickAnim - 610) / 50) * (0-(0.09798)));
            zz = -61.10735 + (((tickAnim - 610) / 50) * (0-(-61.10735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 35) / 5) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 40) / 40) * (15.25-(12.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = 15.25 + (((tickAnim - 80) / 520) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 520) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 621) {
            xx = 15.25 + (((tickAnim - 600) / 21) * (12.5-(15.25)));
            yy = 0 + (((tickAnim - 600) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 21) * (0-(0)));
        }
        else if (tickAnim >= 621 && tickAnim < 660) {
            xx = 12.5 + (((tickAnim - 621) / 39) * (0-(12.5)));
            yy = 0 + (((tickAnim - 621) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 621) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -13.75 + (((tickAnim - 35) / 5) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -13.75 + (((tickAnim - 40) / 40) * (-21.5-(-13.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = -21.5 + (((tickAnim - 80) / 520) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 520) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 621) {
            xx = -21.5 + (((tickAnim - 600) / 21) * (-13.75-(-21.5)));
            yy = 0 + (((tickAnim - 600) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 21) * (0-(0)));
        }
        else if (tickAnim >= 621 && tickAnim < 660) {
            xx = -13.75 + (((tickAnim - 621) / 39) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 621) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 621) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.3-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            zz = 0.3 + (((tickAnim - 80) / 520) * (0.3-(0.3)));
        }
        else if (tickAnim >= 600 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 600) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 60) * (0-(0)));
            zz = 0.3 + (((tickAnim - 600) / 60) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (-6.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7-(0)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -6.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7 + (((tickAnim - 40) / 40) * (-12.25-(-6.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = -12.25 + (((tickAnim - 80) / 520) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 520) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 621) {
            xx = -12.25 + (((tickAnim - 600) / 21) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 600) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 21) * (0-(0)));
        }
        else if (tickAnim >= 621 && tickAnim < 660) {
            xx = 0 + (((tickAnim - 621) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 621) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 621) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (25-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = 25 + (((tickAnim - 80) / 520) * (25-(25)));
            yy = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 520) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 621) {
            xx = 25 + (((tickAnim - 600) / 21) * (0-(25)));
            yy = 0 + (((tickAnim - 600) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (7.25-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.25 + (((tickAnim - 8) / 2) * (6.25-(7.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (2.75-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.75 + (((tickAnim - 10) / 3) * (0-(2.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.5 + (((tickAnim - 3) / 5) * (-13.09589-(0.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.5989-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46242-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -13.09589 + (((tickAnim - 8) / 5) * (0-(-13.09589)));
            yy = -1.5989 + (((tickAnim - 8) / 5) * (0-(-1.5989)));
            zz = -5.46242 + (((tickAnim - 8) / 5) * (0-(-5.46242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 3) / 5) * (31-(3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 8) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(155.3936+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), backleftleg.rotateAngleY + (float) Math.toRadians(52.65753), backleftleg.rotateAngleZ + (float) Math.toRadians(-95.65096));
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(-65.78661), backleftleg2.rotateAngleY + (float) Math.toRadians(-30.02745), backleftleg2.rotateAngleZ + (float) Math.toRadians(3.89899));
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(0);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(0);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(0.4);
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(16.5), backleftleg3.rotateAngleY + (float) Math.toRadians(0), backleftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(55.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-4), backleftleg4.rotateAngleY + (float) Math.toRadians(0), backleftleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*1), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-0.15);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(9.75), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10.42281), tail2.rotateAngleY + (float) Math.toRadians(-5.4881+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(-0.26626));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-1), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+140))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-15.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*18), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-1.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-20), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(155.3936+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), backrightleg.rotateAngleY + (float) Math.toRadians(-52.65753), backrightleg.rotateAngleZ + (float) Math.toRadians(95.65096));
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(-65.78661), backrightleg2.rotateAngleY + (float) Math.toRadians(30.02745), backrightleg2.rotateAngleZ + (float) Math.toRadians(-3.89899));
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(0);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(0);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(0.4);
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(16.5), backrightleg3.rotateAngleY + (float) Math.toRadians(0), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(55.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), backrightleg4.rotateAngleY + (float) Math.toRadians(0), backrightleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-1), upperbody.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(9.6226783187+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), frontleftleg.rotateAngleY + (float) Math.toRadians(-70.78782), frontleftleg.rotateAngleZ + (float) Math.toRadians(46.55471));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(66.03755), frontleftleg2.rotateAngleY + (float) Math.toRadians(-23.13701), frontleftleg2.rotateAngleZ + (float) Math.toRadians(-59.18444));
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(0), frontleftleg4.rotateAngleY + (float) Math.toRadians(0), frontleftleg4.rotateAngleZ + (float) Math.toRadians(79.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4));
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(9.6226783187+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), frontrightleg.rotateAngleY + (float) Math.toRadians(70.78782), frontrightleg.rotateAngleZ + (float) Math.toRadians(-46.55471));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(66.03755), frontrightleg2.rotateAngleY + (float) Math.toRadians(23.13701), frontrightleg2.rotateAngleZ + (float) Math.toRadians(59.18444));
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(0), frontrightleg4.rotateAngleY + (float) Math.toRadians(0), frontrightleg4.rotateAngleZ + (float) Math.toRadians(-79.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(19.75), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-20), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2);
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*1), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRutiodon entity = (EntityPrehistoricFloraRutiodon) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 15) / 3) * (-32.19-(28)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -32.19 + (((tickAnim - 18) / 6) * (-85.45131-(-32.19)));
            yy = 0 + (((tickAnim - 18) / 6) * (0.55352-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (-0.42629-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -85.45131 + (((tickAnim - 24) / 5) * (-49.85387-(-85.45131)));
            yy = 0.55352 + (((tickAnim - 24) / 5) * (1.02796-(0.55352)));
            zz = -0.42629 + (((tickAnim - 24) / 5) * (-0.79169-(-0.42629)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = -49.85387 + (((tickAnim - 29) / 7) * (0-(-49.85387)));
            yy = 1.02796 + (((tickAnim - 29) / 7) * (0-(1.02796)));
            zz = -0.79169 + (((tickAnim - 29) / 7) * (0-(-0.79169)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.6-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -1.125 + (((tickAnim - 18) / 18) * (-0.525-(-1.125)));
            zz = 0.6 + (((tickAnim - 18) / 18) * (0-(0.6)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = -0.525 + (((tickAnim - 36) / 24) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -12.9644 + (((tickAnim - 0) / 15) * (26.75-(-12.9644)));
            yy = -11.54293 + (((tickAnim - 0) / 15) * (0-(-11.54293)));
            zz = 3.36016 + (((tickAnim - 0) / 15) * (0-(3.36016)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 26.75 + (((tickAnim - 15) / 3) * (83.43665-(26.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (-4.49153-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (14.32877-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 83.43665 + (((tickAnim - 18) / 5) * (105.33903-(83.43665)));
            yy = -4.49153 + (((tickAnim - 18) / 5) * (-21.59818-(-4.49153)));
            zz = 14.32877 + (((tickAnim - 18) / 5) * (-1.67861-(14.32877)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 105.33903 + (((tickAnim - 23) / 6) * (97.6848-(105.33903)));
            yy = -21.59818 + (((tickAnim - 23) / 6) * (-18.80227-(-21.59818)));
            zz = -1.67861 + (((tickAnim - 23) / 6) * (2.68961-(-1.67861)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 97.6848 + (((tickAnim - 29) / 7) * (21.39886-(97.6848)));
            yy = -18.80227 + (((tickAnim - 29) / 7) * (1.75909-(-18.80227)));
            zz = 2.68961 + (((tickAnim - 29) / 7) * (3.3625-(2.68961)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 21.39886 + (((tickAnim - 36) / 5) * (16.77856-(21.39886)));
            yy = 1.75909 + (((tickAnim - 36) / 5) * (-1.69606-(1.75909)));
            zz = 3.3625 + (((tickAnim - 36) / 5) * (8.96208-(3.3625)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 16.77856 + (((tickAnim - 41) / 7) * (4.55498-(16.77856)));
            yy = -1.69606 + (((tickAnim - 41) / 7) * (-5.42992-(-1.69606)));
            zz = 8.96208 + (((tickAnim - 41) / 7) * (8.88696-(8.96208)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 4.55498 + (((tickAnim - 48) / 12) * (-12.9644-(4.55498)));
            yy = -5.42992 + (((tickAnim - 48) / 12) * (-11.54293-(-5.42992)));
            zz = 8.88696 + (((tickAnim - 48) / 12) * (3.36016-(8.88696)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 15) * (0.5-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 3) * (1.15-(0.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0.075-(0)));
            yy = 1.15 + (((tickAnim - 18) / 5) * (2.055-(1.15)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.16-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0.075 + (((tickAnim - 23) / 6) * (0-(0.075)));
            yy = 2.055 + (((tickAnim - 23) / 6) * (0.945-(2.055)));
            zz = -0.16 + (((tickAnim - 23) / 6) * (-0.325-(-0.16)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            yy = 0.945 + (((tickAnim - 29) / 7) * (0.05-(0.945)));
            zz = -0.325 + (((tickAnim - 29) / 7) * (0-(-0.325)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 0.05 + (((tickAnim - 36) / 24) * (-0.2-(0.05)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 28 + (((tickAnim - 39) / 4) * (-32.19-(28)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = -32.19 + (((tickAnim - 43) / 6) * (-53.3199-(-32.19)));
            yy = 0 + (((tickAnim - 43) / 6) * (11.02598-(0)));
            zz = 0 + (((tickAnim - 43) / 6) * (-16.49565-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -53.3199 + (((tickAnim - 49) / 4) * (-43.72282-(-53.3199)));
            yy = 11.02598 + (((tickAnim - 49) / 4) * (17.52344-(11.02598)));
            zz = -16.49565 + (((tickAnim - 49) / 4) * (-10.79444-(-16.49565)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -43.72282 + (((tickAnim - 53) / 7) * (0-(-43.72282)));
            yy = 17.52344 + (((tickAnim - 53) / 7) * (0-(17.52344)));
            zz = -10.79444 + (((tickAnim - 53) / 7) * (0-(-10.79444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 18) * (-0.665-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -0.665 + (((tickAnim - 18) / 21) * (0-(-0.665)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0.6-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = -1.125 + (((tickAnim - 43) / 17) * (-0.525-(-1.125)));
            zz = 0.6 + (((tickAnim - 43) / 17) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 21.39886 + (((tickAnim - 0) / 18) * (-27.32142-(21.39886)));
            yy = 1.75909 + (((tickAnim - 0) / 18) * (11.16177-(1.75909)));
            zz = -3.3625 + (((tickAnim - 0) / 18) * (-1.53847-(-3.3625)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -27.32142 + (((tickAnim - 18) / 21) * (26.75-(-27.32142)));
            yy = 11.16177 + (((tickAnim - 18) / 21) * (0-(11.16177)));
            zz = -1.53847 + (((tickAnim - 18) / 21) * (0-(-1.53847)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 26.75 + (((tickAnim - 39) / 4) * (83.43665-(26.75)));
            yy = 0 + (((tickAnim - 39) / 4) * (4.49153-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (-14.32877-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 83.43665 + (((tickAnim - 43) / 5) * (97.72111-(83.43665)));
            yy = 4.49153 + (((tickAnim - 43) / 5) * (22.84184-(4.49153)));
            zz = -14.32877 + (((tickAnim - 43) / 5) * (-17.35552-(-14.32877)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 97.72111 + (((tickAnim - 48) / 5) * (117.1848-(97.72111)));
            yy = 22.84184 + (((tickAnim - 48) / 5) * (18.80227-(22.84184)));
            zz = -17.35552 + (((tickAnim - 48) / 5) * (-2.68961-(-17.35552)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 117.1848 + (((tickAnim - 53) / 7) * (21.39886-(117.1848)));
            yy = 18.80227 + (((tickAnim - 53) / 7) * (1.75909-(18.80227)));
            zz = -2.68961 + (((tickAnim - 53) / 7) * (-3.3625-(-2.68961)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 8) * (0.52-(0.05)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.13-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.52 + (((tickAnim - 8) / 10) * (0.01-(0.52)));
            zz = -0.13 + (((tickAnim - 8) / 10) * (-0.28-(-0.13)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0.01 + (((tickAnim - 18) / 9) * (-0.07-(0.01)));
            zz = -0.28 + (((tickAnim - 18) / 9) * (-0.425-(-0.28)));
        }
        else if (tickAnim >= 27 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 27) / 12) * (0-(0)));
            yy = -0.07 + (((tickAnim - 27) / 12) * (0.5-(-0.07)));
            zz = -0.425 + (((tickAnim - 27) / 12) * (0-(-0.425)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 39) / 4) * (1.15-(0.5)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (-0.4-(0)));
            yy = 1.15 + (((tickAnim - 43) / 5) * (2.055-(1.15)));
            zz = 0 + (((tickAnim - 43) / 5) * (0.04-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -0.4 + (((tickAnim - 48) / 5) * (0-(-0.4)));
            yy = 2.055 + (((tickAnim - 48) / 5) * (0.945-(2.055)));
            zz = 0.04 + (((tickAnim - 48) / 5) * (-0.325-(0.04)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.945 + (((tickAnim - 53) / 7) * (0.05-(0.945)));
            zz = -0.325 + (((tickAnim - 53) / 7) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 35.31363 + (((tickAnim - 0) / 12) * (16.13853-(35.31363)));
            yy = -11.11354 + (((tickAnim - 0) / 12) * (-21.76848-(-11.11354)));
            zz = 35.03062 + (((tickAnim - 0) / 12) * (3.74754-(35.03062)));
        }
        else if (tickAnim >= 12 && tickAnim < 45) {
            xx = 16.13853 + (((tickAnim - 12) / 33) * (32.25-(16.13853)));
            yy = -21.76848 + (((tickAnim - 12) / 33) * (0-(-21.76848)));
            zz = 3.74754 + (((tickAnim - 12) / 33) * (0-(3.74754)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 32.25 + (((tickAnim - 45) / 15) * (35.31363-(32.25)));
            yy = 0 + (((tickAnim - 45) / 15) * (-11.11354-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (35.03062-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0.475 + (((tickAnim - 0) / 12) * (0.2-(0.475)));
            yy = 0.15 + (((tickAnim - 0) / 12) * (0.375-(0.15)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 45) {
            xx = 0.2 + (((tickAnim - 12) / 33) * (0-(0.2)));
            yy = 0.375 + (((tickAnim - 12) / 33) * (0-(0.375)));
            zz = 0 + (((tickAnim - 12) / 33) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0.475-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 12.96985 + (((tickAnim - 0) / 12) * (15.5-(12.96985)));
            yy = -0.23923 + (((tickAnim - 0) / 12) * (0-(-0.23923)));
            zz = -41.14451 + (((tickAnim - 0) / 12) * (0-(-41.14451)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 15.5 + (((tickAnim - 12) / 16) * (1.89-(15.5)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = 1.89 + (((tickAnim - 28) / 17) * (0-(1.89)));
            yy = 0 + (((tickAnim - 28) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 17) * (33.75-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (12.96985-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (-0.23923-(0)));
            zz = 33.75 + (((tickAnim - 45) / 15) * (-41.14451-(33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = -0.5 + (((tickAnim - 12) / 16) * (-0.385-(-0.5)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 28) / 17) * (0-(0)));
            yy = -0.385 + (((tickAnim - 28) / 17) * (0-(-0.385)));
            zz = 0 + (((tickAnim - 28) / 17) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -38.42063 + (((tickAnim - 0) / 12) * (-16.55315-(-38.42063)));
            yy = 16.75215 + (((tickAnim - 0) / 12) * (-27.6071-(16.75215)));
            zz = 91.814 + (((tickAnim - 0) / 12) * (10.40138-(91.814)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = -16.55315 + (((tickAnim - 12) / 14) * (-17.95899-(-16.55315)));
            yy = -27.6071 + (((tickAnim - 12) / 14) * (-3.21538-(-27.6071)));
            zz = 10.40138 + (((tickAnim - 12) / 14) * (1.78564-(10.40138)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -17.95899 + (((tickAnim - 26) / 9) * (-26.54172-(-17.95899)));
            yy = -3.21538 + (((tickAnim - 26) / 9) * (-2.08952-(-3.21538)));
            zz = 1.78564 + (((tickAnim - 26) / 9) * (12.69349-(1.78564)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -26.54172 + (((tickAnim - 35) / 10) * (-11.25-(-26.54172)));
            yy = -2.08952 + (((tickAnim - 35) / 10) * (0-(-2.08952)));
            zz = 12.69349 + (((tickAnim - 35) / 10) * (90.75-(12.69349)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -11.25 + (((tickAnim - 45) / 15) * (-38.42063-(-11.25)));
            yy = 0 + (((tickAnim - 45) / 15) * (16.75215-(0)));
            zz = 90.75 + (((tickAnim - 45) / 15) * (91.814-(90.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg4, frontleftleg4.rotateAngleX + (float) Math.toRadians(xx), frontleftleg4.rotateAngleY + (float) Math.toRadians(yy), frontleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.3 + (((tickAnim - 0) / 5) * (0.3-(0.3)));
            yy = 0.65 + (((tickAnim - 0) / 5) * (0.65-(0.65)));
            zz = 0.475 + (((tickAnim - 0) / 5) * (0.475-(0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0.3 + (((tickAnim - 5) / 7) * (0-(0.3)));
            yy = 0.65 + (((tickAnim - 5) / 7) * (0.525-(0.65)));
            zz = 0.475 + (((tickAnim - 5) / 7) * (0-(0.475)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 14) * (0.025-(0.525)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (-0.35-(0)));
            yy = 0.025 + (((tickAnim - 26) / 9) * (0.485-(0.025)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -0.35 + (((tickAnim - 35) / 7) * (-0.34-(-0.35)));
            yy = 0.485 + (((tickAnim - 35) / 7) * (1.085-(0.485)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -0.34 + (((tickAnim - 42) / 3) * (-0.325-(-0.34)));
            yy = 1.085 + (((tickAnim - 42) / 3) * (0.975-(1.085)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.325 + (((tickAnim - 45) / 10) * (0.17-(-0.325)));
            yy = 0.975 + (((tickAnim - 45) / 10) * (1.13-(0.975)));
            zz = 0 + (((tickAnim - 45) / 10) * (0.27-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0.17 + (((tickAnim - 55) / 5) * (0.3-(0.17)));
            yy = 1.13 + (((tickAnim - 55) / 5) * (0.65-(1.13)));
            zz = 0.27 + (((tickAnim - 55) / 5) * (0.475-(0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg4.rotationPointX = this.frontleftleg4.rotationPointX + (float)(xx);
        this.frontleftleg4.rotationPointY = this.frontleftleg4.rotationPointY - (float)(yy);
        this.frontleftleg4.rotationPointZ = this.frontleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 5.48662 + (((tickAnim - 0) / 17) * (32.25-(5.48662)));
            yy = 2.76721 + (((tickAnim - 0) / 17) * (0-(2.76721)));
            zz = -0.35917 + (((tickAnim - 0) / 17) * (0-(-0.35917)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 32.25 + (((tickAnim - 17) / 15) * (10.93359-(32.25)));
            yy = 0 + (((tickAnim - 17) / 15) * (-5.65573-(0)));
            zz = 0 + (((tickAnim - 17) / 15) * (27.56907-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 10.93359 + (((tickAnim - 32) / 12) * (16.13853-(10.93359)));
            yy = -5.65573 + (((tickAnim - 32) / 12) * (21.76848-(-5.65573)));
            zz = 27.56907 + (((tickAnim - 32) / 12) * (-3.74754-(27.56907)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 16.13853 + (((tickAnim - 44) / 16) * (5.48662-(16.13853)));
            yy = 21.76848 + (((tickAnim - 44) / 16) * (2.76721-(21.76848)));
            zz = -3.74754 + (((tickAnim - 44) / 16) * (-0.35917-(-3.74754)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 17) / 15) * (0.475-(0)));
            yy = 0 + (((tickAnim - 17) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 0.475 + (((tickAnim - 32) / 12) * (-0.2-(0.475)));
            yy = 0.15 + (((tickAnim - 32) / 12) * (0.375-(0.15)));
            zz = 0 + (((tickAnim - 32) / 12) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -0.2 + (((tickAnim - 44) / 16) * (0-(-0.2)));
            yy = 0.375 + (((tickAnim - 44) / 16) * (0-(0.375)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 7.25 + (((tickAnim - 0) / 17) * (-0.50259-(7.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (20.02935-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-15.97204-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = -0.50259 + (((tickAnim - 17) / 15) * (13.56723-(-0.50259)));
            yy = 20.02935 + (((tickAnim - 17) / 15) * (9.64564-(20.02935)));
            zz = -15.97204 + (((tickAnim - 17) / 15) * (-21.69321-(-15.97204)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 13.56723 + (((tickAnim - 32) / 12) * (15.5-(13.56723)));
            yy = 9.64564 + (((tickAnim - 32) / 12) * (0-(9.64564)));
            zz = -21.69321 + (((tickAnim - 32) / 12) * (0-(-21.69321)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 15.5 + (((tickAnim - 44) / 16) * (7.25-(15.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 7) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = -0.5 + (((tickAnim - 44) / 16) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.00149 + (((tickAnim - 0) / 3) * (-7.32696-(-12.00149)));
            yy = 16.30364 + (((tickAnim - 0) / 3) * (12.09291-(16.30364)));
            zz = 7.50413 + (((tickAnim - 0) / 3) * (8.08125-(7.50413)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = -7.32696 + (((tickAnim - 3) / 14) * (11.25-(-7.32696)));
            yy = 12.09291 + (((tickAnim - 3) / 14) * (0-(12.09291)));
            zz = 8.08125 + (((tickAnim - 3) / 14) * (-90.75-(8.08125)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 11.25 + (((tickAnim - 17) / 15) * (1.35961-(11.25)));
            yy = 0 + (((tickAnim - 17) / 15) * (-4.20468-(0)));
            zz = -90.75 + (((tickAnim - 17) / 15) * (-70.7869-(-90.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 1.35961 + (((tickAnim - 32) / 12) * (-16.55315-(1.35961)));
            yy = -4.20468 + (((tickAnim - 32) / 12) * (27.6071-(-4.20468)));
            zz = -70.7869 + (((tickAnim - 32) / 12) * (-10.40138-(-70.7869)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -16.55315 + (((tickAnim - 44) / 16) * (-12.00149-(-16.55315)));
            yy = 27.6071 + (((tickAnim - 44) / 16) * (16.30364-(27.6071)));
            zz = -10.40138 + (((tickAnim - 44) / 16) * (7.50413-(-10.40138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (0.17-(0)));
            yy = 0 + (((tickAnim - 17) / 10) * (1.13-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0.27-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0.17 + (((tickAnim - 27) / 5) * (0.3-(0.17)));
            yy = 1.13 + (((tickAnim - 27) / 5) * (0.65-(1.13)));
            zz = 0.27 + (((tickAnim - 27) / 5) * (0.475-(0.27)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = 0.3 + (((tickAnim - 32) / 12) * (0-(0.3)));
            yy = 0.65 + (((tickAnim - 32) / 12) * (0.525-(0.65)));
            zz = 0.475 + (((tickAnim - 32) / 12) * (0-(0.475)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0.525 + (((tickAnim - 44) / 16) * (0-(0.525)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg4.rotationPointX = this.frontrightleg4.rotationPointX + (float)(xx);
        this.frontrightleg4.rotationPointY = this.frontrightleg4.rotationPointY - (float)(yy);
        this.frontrightleg4.rotationPointZ = this.frontrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -70.0944 + (((tickAnim - 0) / 12) * (-15.6662-(-70.0944)));
            yy = 18.65115 + (((tickAnim - 0) / 12) * (55.44633-(18.65115)));
            zz = -17.7826427054+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 0) / 12) * (2.64031-(-17.7826427054+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -15.6662 + (((tickAnim - 12) / 16) * (-9.07403-(-15.6662)));
            yy = 55.44633 + (((tickAnim - 12) / 16) * (17.94441-(55.44633)));
            zz = 2.64031 + (((tickAnim - 12) / 16) * (1.07578-(2.64031)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = -9.07403 + (((tickAnim - 28) / 17) * (-21.5427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+80))*-15-(-9.07403)));
            yy = 17.94441 + (((tickAnim - 28) / 17) * (-17.4708-(17.94441)));
            zz = 1.07578 + (((tickAnim - 28) / 17) * (-7.83777-(1.07578)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -21.5427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+80))*-15 + (((tickAnim - 45) / 15) * (-70.0944-(-21.5427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+80))*-15)));
            yy = -17.4708 + (((tickAnim - 45) / 15) * (18.65115-(-17.4708)));
            zz = -7.83777 + (((tickAnim - 45) / 15) * (-17.7826427054+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(-7.83777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftlegw, frontleftlegw.rotateAngleX + (float) Math.toRadians(xx), frontleftlegw.rotateAngleY + (float) Math.toRadians(yy), frontleftlegw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 4.7081 + (((tickAnim - 0) / 17) * (21.5427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+80))*15-(4.7081)));
            yy = -16.63809 + (((tickAnim - 0) / 17) * (17.4708-(-16.63809)));
            zz = -2.84145 + (((tickAnim - 0) / 17) * (7.83777-(-2.84145)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 21.5427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+80))*15 + (((tickAnim - 17) / 15) * (-47.4943813615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(21.5427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+80))*15)));
            yy = 17.4708 + (((tickAnim - 17) / 15) * (-18.65115-(17.4708)));
            zz = 7.83777 + (((tickAnim - 17) / 15) * (17.7826427054+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(7.83777)));
        }
        else if (tickAnim >= 32 && tickAnim < 44) {
            xx = -47.4943813615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 32) / 12) * (-15.6662-(-47.4943813615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = -18.65115 + (((tickAnim - 32) / 12) * (-55.44633-(-18.65115)));
            zz = 17.7826427054+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 32) / 12) * (-2.64031-(17.7826427054+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -15.6662 + (((tickAnim - 44) / 16) * (4.7081-(-15.6662)));
            yy = -55.44633 + (((tickAnim - 44) / 16) * (-16.63809-(-55.44633)));
            zz = -2.64031 + (((tickAnim - 44) / 16) * (-2.84145-(-2.64031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightlegw, frontrightlegw.rotateAngleX + (float) Math.toRadians(xx), frontrightlegw.rotateAngleY + (float) Math.toRadians(yy), frontrightlegw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -27.0731 + (((tickAnim - 0) / 18) * (15.98898-(-27.0731)));
            yy = 29.88153 + (((tickAnim - 0) / 18) * (-27.45084-(29.88153)));
            zz = -15.23963 + (((tickAnim - 0) / 18) * (-31.71507-(-15.23963)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 15.98898 + (((tickAnim - 18) / 21) * (-21.59797-(15.98898)));
            yy = -27.45084 + (((tickAnim - 18) / 21) * (-55.96858-(-27.45084)));
            zz = -31.71507 + (((tickAnim - 18) / 21) * (17.40855-(-31.71507)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -21.59797 + (((tickAnim - 39) / 4) * (-14.97142-(-21.59797)));
            yy = -55.96858 + (((tickAnim - 39) / 4) * (-37.43129-(-55.96858)));
            zz = 17.40855 + (((tickAnim - 39) / 4) * (17.36532-(17.40855)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -14.97142 + (((tickAnim - 43) / 10) * (-41.22819-(-14.97142)));
            yy = -37.43129 + (((tickAnim - 43) / 10) * (-26.85069-(-37.43129)));
            zz = 17.36532 + (((tickAnim - 43) / 10) * (-33.93206-(17.36532)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -41.22819 + (((tickAnim - 53) / 7) * (-27.0731-(-41.22819)));
            yy = -26.85069 + (((tickAnim - 53) / 7) * (29.88153-(-26.85069)));
            zz = -33.93206 + (((tickAnim - 53) / 7) * (-15.23963-(-33.93206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2w, backrightleg2w.rotateAngleX + (float) Math.toRadians(xx), backrightleg2w.rotateAngleY + (float) Math.toRadians(yy), backrightleg2w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 0.25 + (((tickAnim - 39) / 14) * (-0.345-(0.25)));
            yy = 0 + (((tickAnim - 39) / 14) * (0.225-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -0.345 + (((tickAnim - 53) / 7) * (0-(-0.345)));
            yy = 0.225 + (((tickAnim - 53) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2w.rotationPointX = this.backrightleg2w.rotationPointX + (float)(xx);
        this.backrightleg2w.rotationPointY = this.backrightleg2w.rotationPointY - (float)(yy);
        this.backrightleg2w.rotationPointZ = this.backrightleg2w.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (70.81445-(0)));
            yy = -26.25 + (((tickAnim - 0) / 39) * (55.86737-(-26.25)));
            zz = 0 + (((tickAnim - 0) / 39) * (49.4081-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 70.81445 + (((tickAnim - 39) / 21) * (0-(70.81445)));
            yy = 55.86737 + (((tickAnim - 39) / 21) * (-26.25-(55.86737)));
            zz = 49.4081 + (((tickAnim - 39) / 21) * (0-(49.4081)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightlegw, backrightlegw.rotateAngleX + (float) Math.toRadians(xx), backrightlegw.rotateAngleY + (float) Math.toRadians(yy), backrightlegw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*2), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*3), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*0.15);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-90))*-0.2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-240))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-3));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 19.36892 + (((tickAnim - 0) / 15) * (70.81445-(19.36892)));
            yy = -37.30152 + (((tickAnim - 0) / 15) * (-55.86737-(-37.30152)));
            zz = -4.83605 + (((tickAnim - 0) / 15) * (-49.4081-(-4.83605)));
        }
        else if (tickAnim >= 15 && tickAnim < 36) {
            xx = 70.81445 + (((tickAnim - 15) / 21) * (0-(70.81445)));
            yy = -55.86737 + (((tickAnim - 15) / 21) * (26.25-(-55.86737)));
            zz = -49.4081 + (((tickAnim - 15) / 21) * (0-(-49.4081)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (19.36892-(0)));
            yy = 26.25 + (((tickAnim - 36) / 24) * (-37.30152-(26.25)));
            zz = 0 + (((tickAnim - 36) / 24) * (-4.83605-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftlegw, backleftlegw.rotateAngleX + (float) Math.toRadians(xx), backleftlegw.rotateAngleY + (float) Math.toRadians(yy), backleftlegw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -5.5 + (((tickAnim - 0) / 15) * (-21.59797-(-5.5)));
            yy = 47.25 + (((tickAnim - 0) / 15) * (55.96858-(47.25)));
            zz = 0 + (((tickAnim - 0) / 15) * (-17.40855-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -21.59797 + (((tickAnim - 15) / 3) * (-14.97142-(-21.59797)));
            yy = 55.96858 + (((tickAnim - 15) / 3) * (37.43129-(55.96858)));
            zz = -17.40855 + (((tickAnim - 15) / 3) * (-17.36532-(-17.40855)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -14.97142 + (((tickAnim - 18) / 11) * (-41.22819-(-14.97142)));
            yy = 37.43129 + (((tickAnim - 18) / 11) * (26.85069-(37.43129)));
            zz = -17.36532 + (((tickAnim - 18) / 11) * (33.93206-(-17.36532)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = -41.22819 + (((tickAnim - 29) / 7) * (-27.0731-(-41.22819)));
            yy = 26.85069 + (((tickAnim - 29) / 7) * (-29.88153-(26.85069)));
            zz = 33.93206 + (((tickAnim - 29) / 7) * (15.23963-(33.93206)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = -27.0731 + (((tickAnim - 36) / 24) * (-5.5-(-27.0731)));
            yy = -29.88153 + (((tickAnim - 36) / 24) * (47.25-(-29.88153)));
            zz = 15.23963 + (((tickAnim - 36) / 24) * (0-(15.23963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2w, backleftleg2w.rotateAngleX + (float) Math.toRadians(xx), backleftleg2w.rotateAngleY + (float) Math.toRadians(yy), backleftleg2w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0.3 + (((tickAnim - 0) / 15) * (-0.25-(-0.3)));
            yy = 0.45 + (((tickAnim - 0) / 15) * (0-(0.45)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = -0.25 + (((tickAnim - 15) / 14) * (-0.345-(-0.25)));
            yy = 0 + (((tickAnim - 15) / 14) * (0.225-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = -0.345 + (((tickAnim - 29) / 7) * (0-(-0.345)));
            yy = 0.225 + (((tickAnim - 29) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 36) / 24) * (0.45-(0)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2w.rotationPointX = this.backleftleg2w.rotationPointX + (float)(xx);
        this.backleftleg2w.rotationPointY = this.backleftleg2w.rotationPointY - (float)(yy);
        this.backleftleg2w.rotationPointZ = this.backleftleg2w.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-350))*10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-350))*3));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-270))*2.5), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-3), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-320))*-2.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-350))*2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));

    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRutiodon e = (EntityPrehistoricFloraRutiodon) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(jaw, (float) Math.toRadians(17), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);


    }
}
