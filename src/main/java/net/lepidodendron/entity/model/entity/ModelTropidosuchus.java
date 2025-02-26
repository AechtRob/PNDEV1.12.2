package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTropidosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTropidosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;

    private ModelAnimator animator;

    public ModelTropidosuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 14.45F, 3.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 23, -2.0F, -1.05F, -2.0F, 4, 4, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 35, 13, -0.5F, -1.45F, -2.0F, 1, 1, 4, 0.002F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.75F, 0.45F, -0.5F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, 0.2956F, 0.0779F, -0.2502F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 20, 38, -1.0231F, -0.3496F, -1.0F, 2, 5, 2, 0.0F, false));
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 0, 0, -1.0231F, -0.3496F, -1.5F, 2, 5, 1, -0.001F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.2269F, 3.7504F, -0.675F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6353F, 0.0F, 0.2174F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 44, 0, -0.5F, 0.0F, -1.0F, 1, 5, 2, -0.001F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 11, 41, -1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.25F, 5.0F, 0.25F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -1.2651F, 0.0416F, 0.0131F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 26, 15, -0.5F, 0.0038F, -0.4128F, 1, 3, 1, 0.0F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 3.0038F, -0.4128F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, 0.3316F, 0.0F, 0.0F);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 28, 8, -1.5F, 0.0F, -3.0F, 3, 0, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.75F, 0.45F, -0.5F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, 0.2956F, -0.0779F, 0.2502F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 20, 38, -0.9769F, -0.3496F, -1.0F, 2, 5, 2, 0.0F, true));
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 0, 0, -0.9769F, -0.3496F, -1.5F, 2, 5, 1, -0.001F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.2269F, 3.7504F, -0.675F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6353F, 0.0F, -0.2174F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 44, 0, -0.5F, 0.0F, -1.0F, 1, 5, 2, -0.001F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 11, 41, 0.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.25F, 5.0F, 0.25F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -1.2651F, -0.0416F, -0.0131F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 26, 15, -0.5F, 0.0038F, -0.4128F, 1, 3, 1, 0.0F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 3.0038F, -0.4128F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, 0.3316F, 0.0F, 0.0F);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 28, 8, -1.5F, 0.0F, -3.0F, 3, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.925F, 1.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 17, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 26, 15, -0.5F, -0.45F, 0.0F, 1, 1, 6, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.075F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 13, -1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.025F, 3.5F);
        this.tail2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 31, -0.5F, -0.15F, -3.125F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.125F, 6.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 23, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 5.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 32, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.25F, -2.3F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, 0.0F, -6.25F, 5, 5, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 6, -0.5F, -0.25F, -6.25F, 1, 1, 7, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, -6.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0567F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 28, 0, -2.0F, 0.0109F, -2.7498F, 4, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.2109F, -1.2498F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 44, -0.5F, -0.575F, -1.5F, 1, 1, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1109F, -2.2498F);
        this.body2.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 13, 28, -1.5F, 0.0F, -4.0F, 3, 2, 4, -0.01F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 39, -0.5F, -0.3F, -3.775F, 1, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 2.0F, -1.5F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 34, -0.5F, -0.225F, -2.55F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.05F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 41, 19, -1.5F, 0.9F, -1.5F, 3, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 23, -0.5F, 0.9F, -5.5F, 1, 1, 4, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.4F, 0.9533F, -0.5477F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2594F, -0.0361F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 45, -0.375F, -0.075F, -0.975F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4F, 0.9533F, -0.5477F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2594F, 0.0361F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 45, -0.625F, -0.075F, -0.975F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5569F, -0.6017F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2967F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 44, -0.5F, -0.5F, -0.95F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.2614F, -1.6906F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2159F, -0.1729F, -0.0238F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 23, -0.725F, 0.1147F, 0.0141F, 1, 1, 2, 0.002F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2614F, -1.6906F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2159F, 0.1729F, 0.0238F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 23, -0.275F, 0.1147F, 0.0141F, 1, 1, 2, 0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.475F, -2.325F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1876F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 10, -0.5F, 0.0022F, -2.3194F, 1, 1, 3, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5563F, 0.85F, -1.7346F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 0, -0.6F, -0.325F, -0.475F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5563F, 0.85F, -1.7346F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.5236F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 0, -0.4F, -0.325F, -0.475F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 1.4F, -1.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 46, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 1.4F, -1.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 46, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.8392F, -3.4066F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1744F, 0.0077F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 0, 0.05F, 0.25F, -2.0F, 0, 1, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.8392F, -3.4066F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1744F, -0.0077F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 0, -0.05F, 0.25F, -2.0F, 0, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1865F, 1.8858F, 0.4737F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 40, -1.6865F, -0.4358F, -1.9737F, 3, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 33, -1.1865F, -1.5608F, -1.9737F, 2, 2, 2, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.6865F, -1.0466F, -3.8802F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0443F, -0.1744F, 0.0077F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 4, 0.075F, 0.25F, -2.0F, 0, 1, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.3135F, -1.0466F, -3.8802F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0443F, 0.1744F, -0.0077F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 4, -0.075F, 0.25F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1865F, 0.5642F, -1.9487F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 35, -0.5F, -1.025F, -4.0F, 1, 1, 4, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.6865F, -0.4858F, -1.9737F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0305F, -0.5236F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 15, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.3135F, -0.4858F, -1.9737F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0305F, 0.5236F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 15, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.0F, 2.5109F, -1.7498F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5672F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 29, 40, -1.0F, -0.1597F, -0.9356F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 2.8901F, 0.2956F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.7418F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 12, 13, -0.5F, 0.25F, -0.5F, 1, 5, 1, 0.0F, false));
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 13, -0.5F, 0.25F, -0.1F, 1, 5, 1, -0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 5.1F, -0.15F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.1309F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 38, 29, -1.5F, 0.0102F, -2.3073F, 3, 0, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.0F, 2.5109F, -1.7498F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5672F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 29, 40, -1.0F, -0.1597F, -0.9356F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 2.8901F, 0.2956F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.7418F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 12, 13, -0.5F, 0.25F, -0.5F, 1, 5, 1, 0.0F, true));
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 13, -0.5F, 0.25F, -0.1F, 1, 5, 1, -0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 5.1F, -0.15F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.1309F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 38, 29, -1.5F, 0.0102F, -2.3073F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.10F;
        this.main.offsetX = -0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(2);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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

        EntityPrehistoricFloraTropidosuchus proteros = (EntityPrehistoricFloraTropidosuchus) e;

        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTropidosuchus ee = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -27.25 + (((tickAnim - 13) / 12) * (11.75-(-27.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 25) / 10) * (-27.25-(11.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 7.5 + (((tickAnim - 13) / 12) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.5 + (((tickAnim - 25) / 10) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 35) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-44.1-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -44.1 + (((tickAnim - 6) / 7) * (-15.75-(-44.1)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -15.75 + (((tickAnim - 13) / 12) * (51.5-(-15.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 51.5 + (((tickAnim - 25) / 5) * (-38.87-(51.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -38.87 + (((tickAnim - 30) / 5) * (-15.75-(-38.87)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.75 + (((tickAnim - 35) / 15) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.14-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.41-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.14 + (((tickAnim - 15) / 2) * (0.23-(0.14)));
            zz = 0.41 + (((tickAnim - 15) / 2) * (0.38-(0.41)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.23 + (((tickAnim - 17) / 1) * (0.325-(0.23)));
            zz = 0.38 + (((tickAnim - 17) / 1) * (0.15-(0.38)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 17) * (0-(0.325)));
            zz = 0.15 + (((tickAnim - 18) / 17) * (0-(0.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (66.23-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 66.23 + (((tickAnim - 6) / 7) * (38-(66.23)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 38 + (((tickAnim - 13) / 5) * (-18.75-(38)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -18.75 + (((tickAnim - 18) / 7) * (49.25-(-18.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 49.25 + (((tickAnim - 25) / 5) * (54.13-(49.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 54.13 + (((tickAnim - 30) / 5) * (38-(54.13)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 35) / 15) * (0-(38)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0.25 + (((tickAnim - 30) / 5) * (0.04-(0.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0.305-(0)));
            zz = 0.04 + (((tickAnim - 35) / 3) * (0.03-(0.04)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0.305 + (((tickAnim - 38) / 4) * (0.35-(0.305)));
            zz = 0.03 + (((tickAnim - 38) / 4) * (0.02-(0.03)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 42) / 5) * (0.325-(0.35)));
            zz = 0.02 + (((tickAnim - 42) / 5) * (0.01-(0.02)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 47) / 3) * (0-(0.325)));
            zz = 0.01 + (((tickAnim - 47) / 3) * (0-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 10) / 11) * (0-(7.5)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -18.25 + (((tickAnim - 10) / 11) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 22.25 + (((tickAnim - 10) / 6) * (0-(22.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 592;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 3.5 + (((tickAnim - 50) / 500) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 3.5 + (((tickAnim - 550) / 8) * (9.5-(3.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 9.5 + (((tickAnim - 558) / 35) * (0-(9.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.645-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = -0.645 + (((tickAnim - 23) / 27) * (-2.175-(-0.645)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            yy = -2.175 + (((tickAnim - 50) / 500) * (-2.175-(-2.175)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = -2.175 + (((tickAnim - 550) / 8) * (-2.18-(-2.175)));
            zz = 0 + (((tickAnim - 550) / 8) * (-2.675-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = -2.18 + (((tickAnim - 558) / 35) * (0-(-2.18)));
            zz = -2.675 + (((tickAnim - 558) / 35) * (0-(-2.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -25.75 + (((tickAnim - 50) / 500) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -25.75 + (((tickAnim - 550) / 8) * (1.75-(-25.75)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 1.75 + (((tickAnim - 558) / 35) * (0-(1.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 51.5 + (((tickAnim - 50) / 500) * (51.5-(51.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 51.5 + (((tickAnim - 550) / 8) * (17.75-(51.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 17.75 + (((tickAnim - 558) / 35) * (0-(17.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(0), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            yy = 0.55 + (((tickAnim - 50) / 500) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 550) / 8) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = 0.55 + (((tickAnim - 558) / 35) * (0-(0.55)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -29.75 + (((tickAnim - 50) / 500) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -29.75 + (((tickAnim - 550) / 8) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -29.75 + (((tickAnim - 558) / 35) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 4) * (0.3-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 554) / 4) * (0-(0.3)));
            zz = 0 + (((tickAnim - 554) / 4) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 17) * (0.4-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            yy = 0.4 + (((tickAnim - 575) / 18) * (0-(0.4)));
            zz = 0 + (((tickAnim - 575) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 18.25 + (((tickAnim - 50) / 500) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 18.25 + (((tickAnim - 550) / 8) * (33.5-(18.25)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 33.5 + (((tickAnim - 558) / 35) * (0-(33.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 3.5 + (((tickAnim - 50) / 500) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 3.5 + (((tickAnim - 550) / 8) * (-16.25-(3.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -16.25 + (((tickAnim - 558) / 35) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 550) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (63.5-(0)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 63.5 + (((tickAnim - 558) / 10) * (-22.83-(63.5)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = -22.83 + (((tickAnim - 568) / 25) * (0-(-22.83)));
            yy = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            yy = 0.6 + (((tickAnim - 50) / 500) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = 0.6 + (((tickAnim - 550) / 8) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 558) / 10) * (0.23-(0.6)));
            zz = 0 + (((tickAnim - 558) / 10) * (0.75-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            yy = 0.23 + (((tickAnim - 568) / 25) * (0-(0.23)));
            zz = 0.75 + (((tickAnim - 568) / 25) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -24.5 + (((tickAnim - 50) / 500) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = -24.5 + (((tickAnim - 550) / 3) * (-41.25-(-24.5)));
            yy = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 558) {
            xx = -41.25 + (((tickAnim - 553) / 5) * (-24.5-(-41.25)));
            yy = 0 + (((tickAnim - 553) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 5) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = -24.5 + (((tickAnim - 558) / 10) * (43.98-(-24.5)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = 43.98 + (((tickAnim - 568) / 25) * (0-(43.98)));
            yy = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 550) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 550) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 18) * (0.625-(0)));
            zz = 0 + (((tickAnim - 550) / 18) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            yy = 0.625 + (((tickAnim - 568) / 25) * (0-(0.625)));
            zz = 0 + (((tickAnim - 568) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = 8.5 + (((tickAnim - 50) / 59) * (9-(8.5)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = 9 + (((tickAnim - 109) / 26) * (8.25-(9)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = 8.25 + (((tickAnim - 135) / 345) * (5.39273-(8.25)));
            yy = 0 + (((tickAnim - 135) / 345) * (0.76943-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (-0.51371-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 5.39273 + (((tickAnim - 480) / 70) * (8.5-(5.39273)));
            yy = 0.76943 + (((tickAnim - 480) / 70) * (0-(0.76943)));
            zz = -0.51371 + (((tickAnim - 480) / 70) * (0-(-0.51371)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 8.5 + (((tickAnim - 550) / 8) * (11.5-(8.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 11.5 + (((tickAnim - 558) / 17) * (7.5-(11.5)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = 7.5 + (((tickAnim - 575) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = -1 + (((tickAnim - 50) / 59) * (-1.75-(-1)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -1.75 + (((tickAnim - 109) / 26) * (-4-(-1.75)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = -4 + (((tickAnim - 135) / 345) * (1.5-(-4)));
            yy = 0 + (((tickAnim - 135) / 345) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 1.5 + (((tickAnim - 480) / 70) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -1 + (((tickAnim - 550) / 8) * (11-(-1)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 11 + (((tickAnim - 558) / 17) * (-4.75-(11)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = -4.75 + (((tickAnim - 575) / 18) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 135) * (-0.075-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = -10.25 + (((tickAnim - 50) / 59) * (-11.25-(-10.25)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -11.25 + (((tickAnim - 109) / 26) * (-7.5-(-11.25)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = -7.5 + (((tickAnim - 135) / 345) * (-11.25-(-7.5)));
            yy = 0 + (((tickAnim - 135) / 345) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = -11.25 + (((tickAnim - 480) / 70) * (-10.25-(-11.25)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = -10.25 + (((tickAnim - 550) / 3) * (-3.42-(-10.25)));
            yy = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 558) {
            xx = -3.42 + (((tickAnim - 553) / 5) * (14.75-(-3.42)));
            yy = 0 + (((tickAnim - 553) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 5) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 570) {
            xx = 14.75 + (((tickAnim - 558) / 12) * (7-(14.75)));
            yy = 0 + (((tickAnim - 558) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 12) * (0-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 582) {
            xx = 7 + (((tickAnim - 570) / 12) * (-11.42-(7)));
            yy = 0 + (((tickAnim - 570) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 570) / 12) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 593) {
            xx = -11.42 + (((tickAnim - 582) / 11) * (0-(-11.42)));
            yy = 0 + (((tickAnim - 582) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = -27 + (((tickAnim - 50) / 59) * (-7.75-(-27)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -7.75 + (((tickAnim - 109) / 26) * (-6.25-(-7.75)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = -6.25 + (((tickAnim - 135) / 345) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 135) / 345) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 480) / 70) * (-27-(0)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = -27 + (((tickAnim - 550) / 3) * (-28.29-(-27)));
            yy = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 555) {
            xx = -28.29 + (((tickAnim - 553) / 2) * (-23.44-(-28.29)));
            yy = 0 + (((tickAnim - 553) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 2) * (0-(0)));
        }
        else if (tickAnim >= 555 && tickAnim < 560) {
            xx = -23.44 + (((tickAnim - 555) / 5) * (17.75-(-23.44)));
            yy = 0 + (((tickAnim - 555) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 555) / 5) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 568) {
            xx = 17.75 + (((tickAnim - 560) / 8) * (25.75-(17.75)));
            yy = 0 + (((tickAnim - 560) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 8) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 582) {
            xx = 25.75 + (((tickAnim - 568) / 14) * (-22.56-(25.75)));
            yy = 0 + (((tickAnim - 568) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 14) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 583) {
            xx = -22.56 + (((tickAnim - 582) / 1) * (-23.34-(-22.56)));
            yy = 0 + (((tickAnim - 582) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 1) * (0-(0)));
        }
        else if (tickAnim >= 583 && tickAnim < 593) {
            xx = -23.34 + (((tickAnim - 583) / 10) * (0-(-23.34)));
            yy = 0 + (((tickAnim - 583) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 583) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 5.75 + (((tickAnim - 50) / 500) * (5.5-(5.75)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 5.5 + (((tickAnim - 550) / 8) * (-2-(5.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = -2 + (((tickAnim - 558) / 17) * (0-(-2)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 8 + (((tickAnim - 50) / 500) * (8-(8)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 8 + (((tickAnim - 550) / 8) * (13.5-(8)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 13.5 + (((tickAnim - 558) / 17) * (0-(13.5)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = -7.25 + (((tickAnim - 50) / 65) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 65) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -7.25 + (((tickAnim - 115) / 10) * (-8.70187-(-7.25)));
            yy = 0 + (((tickAnim - 115) / 10) * (19.99821-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0.27297-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = -8.70187 + (((tickAnim - 125) / 3) * (-8.70187-(-8.70187)));
            yy = 19.99821 + (((tickAnim - 125) / 3) * (19.99821-(19.99821)));
            zz = 0.27297 + (((tickAnim - 125) / 3) * (0.27297-(0.27297)));
        }
        else if (tickAnim >= 128 && tickAnim < 135) {
            xx = -8.70187 + (((tickAnim - 128) / 7) * (-7.25-(-8.70187)));
            yy = 19.99821 + (((tickAnim - 128) / 7) * (0-(19.99821)));
            zz = 0.27297 + (((tickAnim - 128) / 7) * (0-(0.27297)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -7.25 + (((tickAnim - 135) / 30) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 205) {
            xx = -7.25 + (((tickAnim - 165) / 40) * (18.5-(-7.25)));
            yy = 0 + (((tickAnim - 165) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 40) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 290) {
            xx = 18.5 + (((tickAnim - 205) / 85) * (18-(18.5)));
            yy = 0 + (((tickAnim - 205) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 85) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = 18 + (((tickAnim - 290) / 55) * (17-(18)));
            yy = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 55) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = 17 + (((tickAnim - 345) / 95) * (15.25-(17)));
            yy = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 95) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = 15.25 + (((tickAnim - 440) / 40) * (14-(15.25)));
            yy = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 40) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 14 + (((tickAnim - 480) / 36) * (13.5-(14)));
            yy = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 36) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 13.5 + (((tickAnim - 516) / 34) * (12.25-(13.5)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = 12.25 + (((tickAnim - 550) / 4) * (-7.42-(12.25)));
            yy = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = -7.42 + (((tickAnim - 554) / 4) * (32.25-(-7.42)));
            yy = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 554) / 4) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 32.25 + (((tickAnim - 558) / 10) * (8.54-(32.25)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 8.54 + (((tickAnim - 568) / 7) * (-5-(8.54)));
            yy = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = -5 + (((tickAnim - 575) / 7) * (-12-(-5)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 7) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 587) {
            xx = -12 + (((tickAnim - 582) / 5) * (-5-(-12)));
            yy = 0 + (((tickAnim - 582) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 5) * (0-(0)));
        }
        else if (tickAnim >= 587 && tickAnim < 593) {
            xx = -5 + (((tickAnim - 587) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 587) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 587) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.175-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            zz = 0.175 + (((tickAnim - 50) / 65) * (0.175-(0.175)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 0.175 + (((tickAnim - 115) / 20) * (0.175-(0.175)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0.175 + (((tickAnim - 135) / 30) * (0.175-(0.175)));
        }
        else if (tickAnim >= 165 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 165) / 385) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 385) * (0-(0)));
            zz = 0.175 + (((tickAnim - 165) / 385) * (0-(0.175)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0.34-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            zz = 0.34 + (((tickAnim - 554) / 4) * (-0.545-(0.34)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = -0.545 + (((tickAnim - 558) / 17) * (0.055-(-0.545)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0.055 + (((tickAnim - 575) / 7) * (0.405-(0.055)));
        }
        else if (tickAnim >= 582 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 582) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 582) / 11) * (0-(0)));
            zz = 0.405 + (((tickAnim - 582) / 11) * (0-(0.405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.08405-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-13.98355-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.68536-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 3.08405 + (((tickAnim - 10) / 40) * (-7.16595-(3.08405)));
            yy = -13.98355 + (((tickAnim - 10) / 40) * (-13.98355-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 10) / 40) * (-0.68536-(-0.68536)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = -7.16595 + (((tickAnim - 50) / 65) * (-9.16595-(-7.16595)));
            yy = -13.98355 + (((tickAnim - 50) / 65) * (-13.98355-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 50) / 65) * (-0.68536-(-0.68536)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -9.16595 + (((tickAnim - 115) / 5) * (-9.12081-(-9.16595)));
            yy = -13.98355 + (((tickAnim - 115) / 5) * (20.26541-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 115) / 5) * (-0.17912-(-0.68536)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = -9.12081 + (((tickAnim - 120) / 5) * (-4.66674-(-9.12081)));
            yy = 20.26541 + (((tickAnim - 120) / 5) * (13.76363-(20.26541)));
            zz = -0.17912 + (((tickAnim - 120) / 5) * (-0.28554-(-0.17912)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = -4.66674 + (((tickAnim - 125) / 3) * (-4.66674-(-4.66674)));
            yy = 13.76363 + (((tickAnim - 125) / 3) * (13.76363-(13.76363)));
            zz = -0.28554 + (((tickAnim - 125) / 3) * (-0.28554-(-0.28554)));
        }
        else if (tickAnim >= 128 && tickAnim < 132) {
            xx = -4.66674 + (((tickAnim - 128) / 4) * (-6.9475-(-4.66674)));
            yy = 13.76363 + (((tickAnim - 128) / 4) * (-21.87535-(13.76363)));
            zz = -0.28554 + (((tickAnim - 128) / 4) * (-1.56418-(-0.28554)));
        }
        else if (tickAnim >= 132 && tickAnim < 135) {
            xx = -6.9475 + (((tickAnim - 132) / 3) * (-9.16595-(-6.9475)));
            yy = -21.87535 + (((tickAnim - 132) / 3) * (-13.98355-(-21.87535)));
            zz = -1.56418 + (((tickAnim - 132) / 3) * (-0.68536-(-1.56418)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -9.16595 + (((tickAnim - 135) / 30) * (-8.16595-(-9.16595)));
            yy = -13.98355 + (((tickAnim - 135) / 30) * (-13.98355-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 135) / 30) * (-0.68536-(-0.68536)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = -8.16595 + (((tickAnim - 165) / 10) * (-1.38357-(-8.16595)));
            yy = -13.98355 + (((tickAnim - 165) / 10) * (-12.35268-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 165) / 10) * (-0.63246-(-0.68536)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -1.38357 + (((tickAnim - 175) / 13) * (-4.05579-(-1.38357)));
            yy = -12.35268 + (((tickAnim - 175) / 13) * (-11.73468-(-12.35268)));
            zz = -0.63246 + (((tickAnim - 175) / 13) * (-0.61242-(-0.63246)));
        }
        else if (tickAnim >= 188 && tickAnim < 205) {
            xx = -4.05579 + (((tickAnim - 188) / 17) * (-22.69564-(-4.05579)));
            yy = -11.73468 + (((tickAnim - 188) / 17) * (-9.48581-(-11.73468)));
            zz = -0.61242 + (((tickAnim - 188) / 17) * (-0.53949-(-0.61242)));
        }
        else if (tickAnim >= 205 && tickAnim < 290) {
            xx = -22.69564 + (((tickAnim - 205) / 85) * (-21.69564-(-22.69564)));
            yy = -9.48581 + (((tickAnim - 205) / 85) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 205) / 85) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = -21.69564 + (((tickAnim - 290) / 55) * (-19.44564-(-21.69564)));
            yy = -9.48581 + (((tickAnim - 290) / 55) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 290) / 55) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = -19.44564 + (((tickAnim - 345) / 95) * (-16.19564-(-19.44564)));
            yy = -9.48581 + (((tickAnim - 345) / 95) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 345) / 95) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = -16.19564 + (((tickAnim - 440) / 40) * (-13.44564-(-16.19564)));
            yy = -9.48581 + (((tickAnim - 440) / 40) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 440) / 40) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = -13.44564 + (((tickAnim - 480) / 36) * (-12.69564-(-13.44564)));
            yy = -9.48581 + (((tickAnim - 480) / 36) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 480) / 36) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = -12.69564 + (((tickAnim - 516) / 34) * (-10.44564-(-12.69564)));
            yy = -9.48581 + (((tickAnim - 516) / 34) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 516) / 34) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = -10.44564 + (((tickAnim - 550) / 4) * (19.05436-(-10.44564)));
            yy = -9.48581 + (((tickAnim - 550) / 4) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 550) / 4) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 19.05436 + (((tickAnim - 554) / 4) * (-1.19564-(19.05436)));
            yy = -9.48581 + (((tickAnim - 554) / 4) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 554) / 4) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = -1.19564 + (((tickAnim - 558) / 10) * (21.04452-(-1.19564)));
            yy = -9.48581 + (((tickAnim - 558) / 10) * (-3.61364-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 558) / 10) * (-0.20552-(-0.53949)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 21.04452 + (((tickAnim - 568) / 7) * (-15-(21.04452)));
            yy = -3.61364 + (((tickAnim - 568) / 7) * (0-(-3.61364)));
            zz = -0.20552 + (((tickAnim - 568) / 7) * (0-(-0.20552)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = -15 + (((tickAnim - 575) / 7) * (2-(-15)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 7) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 587) {
            xx = 2 + (((tickAnim - 582) / 5) * (-9.75-(2)));
            yy = 0 + (((tickAnim - 582) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 5) * (0-(0)));
        }
        else if (tickAnim >= 587 && tickAnim < 589) {
            xx = -9.75 + (((tickAnim - 587) / 2) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 587) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 587) / 2) * (0-(0)));
        }
        else if (tickAnim >= 589 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 589) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 589) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 589) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 0) / 165) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 165) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 165) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 165) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 40) * (0.125-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 205) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 85) * (0-(0)));
            zz = 0.125 + (((tickAnim - 205) / 85) * (0.125-(0.125)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            zz = 0.125 + (((tickAnim - 290) / 55) * (0.125-(0.125)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            zz = 0.125 + (((tickAnim - 345) / 95) * (0.125-(0.125)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            zz = 0.125 + (((tickAnim - 440) / 40) * (0.125-(0.125)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            zz = 0.125 + (((tickAnim - 480) / 36) * (0.125-(0.125)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0.125 + (((tickAnim - 516) / 34) * (0.125-(0.125)));
        }
        else if (tickAnim >= 550 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 550) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 43) * (0-(0)));
            zz = 0.125 + (((tickAnim - 550) / 43) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (22.75-(0)));
            yy = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 22.75 + (((tickAnim - 554) / 4) * (0-(22.75)));
            yy = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 554) / 4) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = 17.5 + (((tickAnim - 575) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 7) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 587) {
            xx = 0 + (((tickAnim - 582) / 5) * (15.75-(0)));
            yy = 0 + (((tickAnim - 582) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 5) * (0-(0)));
        }
        else if (tickAnim >= 587 && tickAnim < 589) {
            xx = 15.75 + (((tickAnim - 587) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 587) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 587) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (38.67962-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (4.3797-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-1.84046-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 38.67962 + (((tickAnim - 50) / 430) * (38.67962-(38.67962)));
            yy = 4.3797 + (((tickAnim - 50) / 430) * (4.3797-(4.3797)));
            zz = -1.84046 + (((tickAnim - 50) / 430) * (-1.84046-(-1.84046)));
        }
        else if (tickAnim >= 480 && tickAnim < 498) {
            xx = 38.67962 + (((tickAnim - 480) / 18) * (40.69124-(38.67962)));
            yy = 4.3797 + (((tickAnim - 480) / 18) * (8.85406-(4.3797)));
            zz = -1.84046 + (((tickAnim - 480) / 18) * (-3.40209-(-1.84046)));
        }
        else if (tickAnim >= 498 && tickAnim < 516) {
            xx = 40.69124 + (((tickAnim - 498) / 18) * (38.21371-(40.69124)));
            yy = 8.85406 + (((tickAnim - 498) / 18) * (13.12504-(8.85406)));
            zz = -3.40209 + (((tickAnim - 498) / 18) * (-4.89273-(-3.40209)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 38.21371 + (((tickAnim - 516) / 34) * (38.21371-(38.21371)));
            yy = 13.12504 + (((tickAnim - 516) / 34) * (13.12504-(13.12504)));
            zz = -4.89273 + (((tickAnim - 516) / 34) * (-4.89273-(-4.89273)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 38.21371 + (((tickAnim - 550) / 8) * (38.21371-(38.21371)));
            yy = 13.12504 + (((tickAnim - 550) / 8) * (13.12504-(13.12504)));
            zz = -4.89273 + (((tickAnim - 550) / 8) * (-4.89273-(-4.89273)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 38.21371 + (((tickAnim - 558) / 35) * (0-(38.21371)));
            yy = 13.12504 + (((tickAnim - 558) / 35) * (0-(13.12504)));
            zz = -4.89273 + (((tickAnim - 558) / 35) * (0-(-4.89273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 290) {
            xx = -87.5 + (((tickAnim - 50) / 240) * (-87-(-87.5)));
            yy = 0 + (((tickAnim - 50) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 240) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = -87 + (((tickAnim - 290) / 55) * (-87-(-87)));
            yy = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 55) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = -87 + (((tickAnim - 345) / 95) * (-87-(-87)));
            yy = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 95) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = -87 + (((tickAnim - 440) / 40) * (-87.5-(-87)));
            yy = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 40) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 498) {
            xx = -87.5 + (((tickAnim - 480) / 18) * (-99.5-(-87.5)));
            yy = 0 + (((tickAnim - 480) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 18) * (0-(0)));
        }
        else if (tickAnim >= 498 && tickAnim < 516) {
            xx = -99.5 + (((tickAnim - 498) / 18) * (-87.5-(-99.5)));
            yy = 0 + (((tickAnim - 498) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 498) / 18) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = -87.5 + (((tickAnim - 516) / 34) * (-87.5-(-87.5)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -87.5 + (((tickAnim - 550) / 8) * (-45.75-(-87.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -45.75 + (((tickAnim - 558) / 35) * (0-(-45.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            yy = -0.775 + (((tickAnim - 50) / 430) * (-0.775-(-0.775)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            yy = -0.775 + (((tickAnim - 480) / 36) * (-0.775-(-0.775)));
            zz = 0 + (((tickAnim - 480) / 36) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            yy = -0.775 + (((tickAnim - 516) / 34) * (-0.775-(-0.775)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = -0.775 + (((tickAnim - 550) / 8) * (-0.175-(-0.775)));
            zz = 0 + (((tickAnim - 550) / 8) * (1.025-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 558) / 35) * (0-(-0.175)));
            zz = 1.025 + (((tickAnim - 558) / 35) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 34.25 + (((tickAnim - 50) / 430) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 498) {
            xx = 34.25 + (((tickAnim - 480) / 18) * (65.75-(34.25)));
            yy = 0 + (((tickAnim - 480) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 18) * (0-(0)));
        }
        else if (tickAnim >= 498 && tickAnim < 516) {
            xx = 65.75 + (((tickAnim - 498) / 18) * (34.25-(65.75)));
            yy = 0 + (((tickAnim - 498) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 498) / 18) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 34.25 + (((tickAnim - 516) / 34) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 34.25 + (((tickAnim - 550) / 8) * (-12.5-(34.25)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -12.5 + (((tickAnim - 558) / 35) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0.125 + (((tickAnim - 23) / 15) * (0.26-(0.125)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.26 + (((tickAnim - 38) / 12) * (0-(0.26)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 36) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 553) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 553) / 1) * (0.325-(0.3)));
            zz = 0 + (((tickAnim - 553) / 1) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 556) {
            xx = 0 + (((tickAnim - 554) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 554) / 2) * (0.24-(0.325)));
            zz = 0 + (((tickAnim - 554) / 2) * (0-(0)));
        }
        else if (tickAnim >= 556 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 556) / 2) * (0-(0)));
            yy = 0.24 + (((tickAnim - 556) / 2) * (0-(0.24)));
            zz = 0 + (((tickAnim - 556) / 2) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            yy = 0.4 + (((tickAnim - 568) / 7) * (0.595-(0.4)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 575) / 5) * (0-(0)));
            yy = 0.595 + (((tickAnim - 575) / 5) * (0.35-(0.595)));
            zz = 0 + (((tickAnim - 575) / 5) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 580) / 13) * (0-(0)));
            yy = 0.35 + (((tickAnim - 580) / 13) * (0-(0.35)));
            zz = 0 + (((tickAnim - 580) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (37.73594-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-2.11758-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.76066-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 37.73594 + (((tickAnim - 50) / 430) * (37.73594-(37.73594)));
            yy = -2.11758 + (((tickAnim - 50) / 430) * (-2.11758-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 50) / 430) * (0.76066-(0.76066)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 37.73594 + (((tickAnim - 480) / 70) * (37.73594-(37.73594)));
            yy = -2.11758 + (((tickAnim - 480) / 70) * (-2.11758-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 480) / 70) * (0.76066-(0.76066)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 37.73594 + (((tickAnim - 550) / 8) * (37.73594-(37.73594)));
            yy = -2.11758 + (((tickAnim - 550) / 8) * (-2.11758-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 550) / 8) * (0.76066-(0.76066)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 37.73594 + (((tickAnim - 558) / 35) * (0-(37.73594)));
            yy = -2.11758 + (((tickAnim - 558) / 35) * (0-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 558) / 35) * (0-(0.76066)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-67-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = -67 + (((tickAnim - 50) / 430) * (-67-(-67)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = -67 + (((tickAnim - 480) / 70) * (-67-(-67)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -67 + (((tickAnim - 550) / 8) * (-27.75-(-67)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -27.75 + (((tickAnim - 558) / 35) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.925-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            yy = -0.8 + (((tickAnim - 50) / 430) * (-0.8-(-0.8)));
            zz = 0.925 + (((tickAnim - 50) / 430) * (0.925-(0.925)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            yy = -0.8 + (((tickAnim - 480) / 70) * (-0.8-(-0.8)));
            zz = 0.925 + (((tickAnim - 480) / 70) * (0.925-(0.925)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = -0.8 + (((tickAnim - 550) / 8) * (0-(-0.8)));
            zz = 0.925 + (((tickAnim - 550) / 8) * (0.7-(0.925)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0.7 + (((tickAnim - 558) / 35) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 16 + (((tickAnim - 50) / 430) * (16-(16)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 16 + (((tickAnim - 480) / 70) * (16-(16)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 16 + (((tickAnim - 550) / 8) * (-30.5-(16)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -30.5 + (((tickAnim - 558) / 35) * (0-(-30.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 550) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 3) * (0.435-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 553) / 5) * (0-(0)));
            yy = 0.435 + (((tickAnim - 553) / 5) * (0.15-(0.435)));
            zz = 0 + (((tickAnim - 553) / 5) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 558) / 10) * (0.6-(0.15)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 568) / 7) * (0.735-(0.6)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 575) / 5) * (0-(0)));
            yy = 0.735 + (((tickAnim - 575) / 5) * (0.625-(0.735)));
            zz = 0 + (((tickAnim - 575) / 5) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 580) / 13) * (0-(0)));
            yy = 0.625 + (((tickAnim - 580) / 13) * (0-(0.625)));
            zz = 0 + (((tickAnim - 580) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 15) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.2 + (((tickAnim - 15) / 20) * (-2.2-(-2.2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.2 + (((tickAnim - 35) / 15) * (0-(-2.2)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.98982-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-10.98558-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.56408-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18.98982 + (((tickAnim - 15) / 20) * (-18.98982-(-18.98982)));
            yy = -10.98558 + (((tickAnim - 15) / 20) * (-10.98558-(-10.98558)));
            zz = -0.56408 + (((tickAnim - 15) / 20) * (-0.56408-(-0.56408)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.98982 + (((tickAnim - 35) / 15) * (0-(-18.98982)));
            yy = -10.98558 + (((tickAnim - 35) / 15) * (0-(-10.98558)));
            zz = -0.56408 + (((tickAnim - 35) / 15) * (0-(-0.56408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (51-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 51 + (((tickAnim - 15) / 20) * (51-(51)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 51 + (((tickAnim - 35) / 15) * (0-(51)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -37 + (((tickAnim - 15) / 20) * (-37-(-37)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -37 + (((tickAnim - 35) / 15) * (0-(-37)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.25 + (((tickAnim - 15) / 20) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 21.25 + (((tickAnim - 35) / 15) * (0-(21.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 3) / 5) * (0.225-(0.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.35-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 43) / 7) * (0-(0.35)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.98982-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.9856-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.5641-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18.98982 + (((tickAnim - 15) / 20) * (-18.98982-(-18.98982)));
            yy = 10.9856 + (((tickAnim - 15) / 20) * (10.9856-(10.9856)));
            zz = 0.5641 + (((tickAnim - 15) / 20) * (0.5641-(0.5641)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.98982 + (((tickAnim - 35) / 15) * (0-(-18.98982)));
            yy = 10.9856 + (((tickAnim - 35) / 15) * (0-(10.9856)));
            zz = 0.5641 + (((tickAnim - 35) / 15) * (0-(0.5641)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (51-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 51 + (((tickAnim - 15) / 20) * (51-(51)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 51 + (((tickAnim - 35) / 15) * (0-(51)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -37 + (((tickAnim - 15) / 20) * (-37-(-37)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -37 + (((tickAnim - 35) / 15) * (0-(-37)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.25 + (((tickAnim - 15) / 20) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 21.25 + (((tickAnim - 35) / 15) * (0-(21.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 3) / 5) * (0.225-(0.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 43) / 7) * (0-(0.375)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.08-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0.08 + (((tickAnim - 5) / 10) * (19-(0.08)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19 + (((tickAnim - 15) / 20) * (19-(19)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 19 + (((tickAnim - 35) / 8) * (3.5-(19)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 43) / 7) * (0-(3.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.33-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 7.33 + (((tickAnim - 5) / 10) * (31.75-(7.33)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.75 + (((tickAnim - 15) / 20) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 35) / 15) * (0-(31.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 15) / 20) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 35) / 15) * (0-(12.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(0), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.35 + (((tickAnim - 35) / 15) * (0-(0.35)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(0), frontRightLeg2.rotateAngleY + (float) Math.toRadians(0), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.4 + (((tickAnim - 15) / 20) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.4 + (((tickAnim - 35) / 15) * (0-(0.4)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 7;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.25 + (((tickAnim - 3) / 2) * (-7.5-(10.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 5) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -23.75 + (((tickAnim - 3) / 2) * (-13-(-23.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -13 + (((tickAnim - 5) / 3) * (0-(-13)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11 + (((tickAnim - 3) / 2) * (33-(11)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 33 + (((tickAnim - 5) / 2) * (0-(33)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 15.25 + (((tickAnim - 7) / 6) * (0-(15.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 22.25 + (((tickAnim - 7) / 2) * (12.75-(22.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12.75 + (((tickAnim - 9) / 4) * (0-(12.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 9 + (((tickAnim - 7) / 2) * (25-(9)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 9) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (16.25-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 16.25 + (((tickAnim - 7) / 2) * (0-(16.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.7794-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (14.48993-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-5.62585-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -11.7794 + (((tickAnim - 7) / 6) * (0-(-11.7794)));
            yy = 14.48993 + (((tickAnim - 7) / 6) * (0-(14.48993)));
            zz = -5.62585 + (((tickAnim - 7) / 6) * (0-(-5.62585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -22.25 + (((tickAnim - 7) / 6) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 7) / 6) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 23 + (((tickAnim - 7) / 6) * (0-(23)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.7794-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-14.4899-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (5.6258-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -11.7794 + (((tickAnim - 7) / 6) * (0-(-11.7794)));
            yy = -14.4899 + (((tickAnim - 7) / 6) * (0-(-14.4899)));
            zz = 5.6258 + (((tickAnim - 7) / 6) * (0-(5.6258)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -22.25 + (((tickAnim - 7) / 6) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 7) / 6) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 23 + (((tickAnim - 7) / 6) * (0-(23)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*5), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+60))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -60.06 + (((tickAnim - 0) / 1) * (-72.6176-(-60.06)));
            yy = -15.36 + (((tickAnim - 0) / 1) * (-30.71691-(-15.36)));
            zz = 3.36 + (((tickAnim - 0) / 1) * (6.72295-(3.36)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -72.6176 + (((tickAnim - 1) / 1) * (-68.32745-(-72.6176)));
            yy = -30.71691 + (((tickAnim - 1) / 1) * (-14.27817-(-30.71691)));
            zz = 6.72295 + (((tickAnim - 1) / 1) * (17.45395-(6.72295)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -68.32745 + (((tickAnim - 2) / 2) * (42.5-(-68.32745)));
            yy = -14.27817 + (((tickAnim - 2) / 2) * (0-(-14.27817)));
            zz = 17.45395 + (((tickAnim - 2) / 2) * (0-(17.45395)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 42.5 + (((tickAnim - 4) / 1) * (-60.06-(42.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (-15.36-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (3.36-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 76.25 + (((tickAnim - 0) / 1) * (62.5-(76.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 62.5 + (((tickAnim - 1) / 1) * (2.5-(62.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (31.25-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 31.25 + (((tickAnim - 3) / 0) * (52.5-(31.25)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 52.5 + (((tickAnim - 3) / 1) * (0-(52.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (76.25-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10 + (((tickAnim - 0) / 1) * (-25-(10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 1) / 1) * (17.5-(-25)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 2) / 1) * (-25-(17.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 3) / 0) * (35-(-25)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 3) / 1) * (45-(35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 4) / 1) * (10-(45)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 134.17 + (((tickAnim - 0) / 1) * (88.33-(134.17)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 88.33 + (((tickAnim - 1) / 1) * (57.5-(88.33)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 57.5 + (((tickAnim - 2) / 1) * (34.17-(57.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 34.17 + (((tickAnim - 3) / 1) * (90-(34.17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 90 + (((tickAnim - 4) / 1) * (134.17-(90)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 42.5 + (((tickAnim - 0) / 2) * (-72.6176-(42.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (30.71691-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-6.72295-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -72.6176 + (((tickAnim - 2) / 1) * (-67.25675-(-72.6176)));
            yy = 30.71691 + (((tickAnim - 2) / 1) * (20.09826-(30.71691)));
            zz = -6.72295 + (((tickAnim - 2) / 1) * (-12.60198-(-6.72295)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -67.25675 + (((tickAnim - 3) / 1) * (28.33-(-67.25675)));
            yy = 20.09826 + (((tickAnim - 3) / 1) * (0-(20.09826)));
            zz = -12.60198 + (((tickAnim - 3) / 1) * (0-(-12.60198)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 28.33 + (((tickAnim - 4) / 1) * (42.5-(28.33)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (62.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 62.5 + (((tickAnim - 2) / 1) * (2.5-(62.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (31.25-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 31.25 + (((tickAnim - 3) / 1) * (30-(31.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 30 + (((tickAnim - 4) / 1) * (0-(30)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 45 + (((tickAnim - 0) / 2) * (-25-(45)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 2) / 1) * (17.5-(-25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 3) / 0) * (-25-(17.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (35-(-25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 35 + (((tickAnim - 4) / 1) * (45-(35)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 90 + (((tickAnim - 0) / 1) * (134.17-(90)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 134.17 + (((tickAnim - 1) / 1) * (88.33-(134.17)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 88.33 + (((tickAnim - 2) / 1) * (57.5-(88.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 57.5 + (((tickAnim - 3) / 0) * (13.34-(57.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 13.34 + (((tickAnim - 3) / 1) * (34.17-(13.34)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 34.17 + (((tickAnim - 4) / 1) * (90-(34.17)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50-60*2))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50-60*3))*10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50-60*4))*10), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50-60*5))*15), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+100))*10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -59.30217 + (((tickAnim - 0) / 1) * (7.01644-(-59.30217)));
            yy = 3.50841 + (((tickAnim - 0) / 1) * (7.28258-(3.50841)));
            zz = -1.1443 + (((tickAnim - 0) / 1) * (3.99574-(-1.1443)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 7.01644 + (((tickAnim - 1) / 1) * (54.94288-(7.01644)));
            yy = 7.28258 + (((tickAnim - 1) / 1) * (9.71003-(7.28258)));
            zz = 3.99574 + (((tickAnim - 1) / 1) * (-1.48886-(3.99574)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 54.94288 + (((tickAnim - 2) / 1) * (12.03928-(54.94288)));
            yy = 9.71003 + (((tickAnim - 2) / 1) * (0.68074-(9.71003)));
            zz = -1.48886 + (((tickAnim - 2) / 1) * (-29.6925-(-1.48886)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 12.03928 + (((tickAnim - 3) / 1) * (-89.90093-(12.03928)));
            yy = 0.68074 + (((tickAnim - 3) / 1) * (4.21541-(0.68074)));
            zz = -29.6925 + (((tickAnim - 3) / 1) * (2.69136-(-29.6925)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -89.90093 + (((tickAnim - 4) / 1) * (-59.30217-(-89.90093)));
            yy = 4.21541 + (((tickAnim - 4) / 1) * (3.50841-(4.21541)));
            zz = 2.69136 + (((tickAnim - 4) / 1) * (-1.1443-(2.69136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.5 + (((tickAnim - 0) / 1) * (-7.5-(17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -7.5 + (((tickAnim - 1) / 1) * (-32.5-(-7.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -32.5 + (((tickAnim - 2) / 1) * (-67.5-(-32.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -67.5 + (((tickAnim - 3) / 0) * (-27.5-(-67.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 3) / 1) * (42.5-(-27.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 42.5 + (((tickAnim - 4) / 1) * (17.5-(42.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 50.63 + (((tickAnim - 0) / 1) * (33.75-(50.63)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 33.75 + (((tickAnim - 1) / 1) * (130.63-(33.75)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 130.63 + (((tickAnim - 2) / 1) * (135-(130.63)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 135 + (((tickAnim - 3) / 1) * (67.5-(135)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 67.5 + (((tickAnim - 4) / 1) * (50.63-(67.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -89.90093 + (((tickAnim - 0) / 2) * (6.65177-(-89.90093)));
            yy = -4.21541 + (((tickAnim - 0) / 2) * (-1.47825-(-4.21541)));
            zz = -2.69136 + (((tickAnim - 0) / 2) * (0.76997-(-2.69136)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.65177 + (((tickAnim - 2) / 1) * (54.94288-(6.65177)));
            yy = -1.47825 + (((tickAnim - 2) / 1) * (-9.71003-(-1.47825)));
            zz = 0.76997 + (((tickAnim - 2) / 1) * (1.48886-(0.76997)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 54.94288 + (((tickAnim - 3) / 0) * (8.84802-(54.94288)));
            yy = -9.71003 + (((tickAnim - 3) / 0) * (-0.03679-(-9.71003)));
            zz = 1.48886 + (((tickAnim - 3) / 0) * (29.62082-(1.48886)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.84802 + (((tickAnim - 3) / 2) * (-89.90093-(8.84802)));
            yy = -0.03679 + (((tickAnim - 3) / 2) * (-4.21541-(-0.03679)));
            zz = 29.62082 + (((tickAnim - 3) / 2) * (-2.69136-(29.62082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.5 + (((tickAnim - 0) / 3) * (-32.5-(42.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -32.5 + (((tickAnim - 3) / 0) * (-67.5-(-32.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -67.5 + (((tickAnim - 3) / 1) * (-27.5-(-67.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -27.5 + (((tickAnim - 4) / 1) * (42.5-(-27.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 67.5 + (((tickAnim - 0) / 2) * (33.75-(67.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 33.75 + (((tickAnim - 2) / 1) * (130.63-(33.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 130.63 + (((tickAnim - 3) / 0) * (135-(130.63)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 135 + (((tickAnim - 3) / 2) * (67.5-(135)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-120))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-30))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+90))*5));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTropidosuchus entity = (EntityPrehistoricFloraTropidosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*0.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-0.06);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.05);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 12.13914 + (((tickAnim - 0) / 9) * (-37.59965-(12.13914)));
            yy = 3.7689 + (((tickAnim - 0) / 9) * (-15.4648-(3.7689)));
            zz = 2.4617 + (((tickAnim - 0) / 9) * (-1.2271-(2.4617)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -37.59965 + (((tickAnim - 9) / 11) * (12.13914-(-37.59965)));
            yy = -15.4648 + (((tickAnim - 9) / 11) * (3.7689-(-15.4648)));
            zz = -1.2271 + (((tickAnim - 9) / 11) * (2.4617-(-1.2271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11 + (((tickAnim - 0) / 2) * (22.96-(11)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 22.96 + (((tickAnim - 2) / 5) * (2.96-(22.96)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2.96 + (((tickAnim - 7) / 2) * (14.75-(2.96)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 9) / 11) * (11-(14.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 2) / 3) * (0.68-(0.425)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.68 + (((tickAnim - 5) / 4) * (0-(0.68)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 55.75 + (((tickAnim - 0) / 2) * (10.32-(55.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 10.32 + (((tickAnim - 2) / 3) * (-11.57-(10.32)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -11.57 + (((tickAnim - 5) / 2) * (-30.67-(-11.57)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -30.67 + (((tickAnim - 7) / 2) * (-5.75-(-30.67)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 9) / 11) * (55.75-(-5.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 5) * (0.5-(0.2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.475-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 5) / 4) * (0-(0.5)));
            zz = 0.475 + (((tickAnim - 5) / 4) * (0-(0.475)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.21-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 2) * (0.595-(0.425)));
            zz = 0.21 + (((tickAnim - 11) / 2) * (0.405-(0.21)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.595 + (((tickAnim - 13) / 0) * (0.5-(0.595)));
            zz = 0.405 + (((tickAnim - 13) / 0) * (0.425-(0.405)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 7) * (0.2-(0.5)));
            zz = 0.425 + (((tickAnim - 13) / 7) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (100.73-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 100.73 + (((tickAnim - 2) / 3) * (52.4-(100.73)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 52.4 + (((tickAnim - 5) / 2) * (76.91-(52.4)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 76.91 + (((tickAnim - 7) / 2) * (34-(76.91)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 34 + (((tickAnim - 9) / 4) * (-12.64-(34)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -12.64 + (((tickAnim - 13) / 3) * (-29.52-(-12.64)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -29.52 + (((tickAnim - 16) / 4) * (0-(-29.52)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.85-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.475-(0)));
            zz = 0.85 + (((tickAnim - 2) / 3) * (0.425-(0.85)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 5) / 4) * (0-(0.475)));
            zz = 0.425 + (((tickAnim - 5) / 4) * (0-(0.425)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (-0.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.125-(0)));
            zz = -0.15 + (((tickAnim - 10) / 2) * (-0.165-(-0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 12) / 1) * (0.075-(0.125)));
            zz = -0.165 + (((tickAnim - 12) / 1) * (0-(-0.165)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 13) / 7) * (0-(0.075)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -37.59965 + (((tickAnim - 0) / 11) * (12.13914-(-37.59965)));
            yy = 15.46478 + (((tickAnim - 0) / 11) * (3.7689-(15.46478)));
            zz = 1.22712 + (((tickAnim - 0) / 11) * (2.4617-(1.22712)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 12.13914 + (((tickAnim - 11) / 9) * (-37.59965-(12.13914)));
            yy = 3.7689 + (((tickAnim - 11) / 9) * (15.46478-(3.7689)));
            zz = 2.4617 + (((tickAnim - 11) / 9) * (1.22712-(2.4617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 14.75 + (((tickAnim - 0) / 11) * (11-(14.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 11 + (((tickAnim - 11) / 2) * (22.96-(11)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.96 + (((tickAnim - 13) / 5) * (2.96-(22.96)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.96 + (((tickAnim - 18) / 2) * (14.75-(2.96)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 3) * (0.68-(0.425)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.68 + (((tickAnim - 16) / 4) * (0-(0.68)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -5.75 + (((tickAnim - 0) / 11) * (55.75-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 55.75 + (((tickAnim - 11) / 2) * (10.32-(55.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 10.32 + (((tickAnim - 13) / 3) * (-11.57-(10.32)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.57 + (((tickAnim - 16) / 2) * (-30.67-(-11.57)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -30.67 + (((tickAnim - 18) / 2) * (-5.75-(-30.67)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.21-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 2) / 1) * (0.595-(0.425)));
            zz = 0.21 + (((tickAnim - 2) / 1) * (0.405-(0.21)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.595 + (((tickAnim - 3) / 1) * (0.5-(0.595)));
            zz = 0.405 + (((tickAnim - 3) / 1) * (0.425-(0.405)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 4) / 7) * (0.2-(0.5)));
            zz = 0.425 + (((tickAnim - 4) / 7) * (0-(0.425)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 11) / 5) * (0.5-(0.2)));
            zz = 0 + (((tickAnim - 11) / 5) * (0.475-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 16) / 4) * (0-(0.5)));
            zz = 0.475 + (((tickAnim - 16) / 4) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 34 + (((tickAnim - 0) / 4) * (-12.64-(34)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.64 + (((tickAnim - 4) / 3) * (-29.52-(-12.64)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -29.52 + (((tickAnim - 7) / 4) * (0-(-29.52)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (100.73-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 100.73 + (((tickAnim - 13) / 3) * (52.4-(100.73)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 52.4 + (((tickAnim - 16) / 2) * (76.91-(52.4)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 76.91 + (((tickAnim - 18) / 2) * (34-(76.91)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.175-(0)));
            zz = -0.05 + (((tickAnim - 0) / 1) * (-0.115-(-0.05)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 1) / 3) * (0-(0.175)));
            zz = -0.115 + (((tickAnim - 1) / 3) * (0-(-0.115)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0.85-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.475-(0)));
            zz = 0.85 + (((tickAnim - 13) / 3) * (0.425-(0.85)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 16) / 4) * (0-(0.475)));
            zz = 0.425 + (((tickAnim - 16) / 4) * (-0.05-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+20))*-0.8), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*0.8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+120))*0.8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-0.8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-280))*2.5));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -35.75 + (((tickAnim - 0) / 9) * (26.11939-(-35.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (4.1795-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.5783-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 26.11939 + (((tickAnim - 9) / 11) * (-35.75-(26.11939)));
            yy = 4.1795 + (((tickAnim - 9) / 11) * (0-(4.1795)));
            zz = -3.5783 + (((tickAnim - 9) / 11) * (0-(-3.5783)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 9) * (0-(0.4)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0.4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 13.25 + (((tickAnim - 0) / 9) * (19.00319-(13.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.3987-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (9.6671-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 19.00319 + (((tickAnim - 9) / 4) * (-37.70957-(19.00319)));
            yy = 0.3987 + (((tickAnim - 9) / 4) * (0.24535-(0.3987)));
            zz = 9.6671 + (((tickAnim - 9) / 4) * (5.94898-(9.6671)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.70957 + (((tickAnim - 13) / 4) * (-33.47979-(-37.70957)));
            yy = 0.24535 + (((tickAnim - 13) / 4) * (0.12268-(0.24535)));
            zz = 5.94898 + (((tickAnim - 13) / 4) * (2.97449-(5.94898)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -33.47979 + (((tickAnim - 17) / 3) * (13.25-(-33.47979)));
            yy = 0.12268 + (((tickAnim - 17) / 3) * (0-(0.12268)));
            zz = 2.97449 + (((tickAnim - 17) / 3) * (0-(2.97449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.05-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0.525-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 4) * (0-(0.05)));
            zz = 0.525 + (((tickAnim - 13) / 4) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.75 + (((tickAnim - 0) / 2) * (10.95-(24.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.95 + (((tickAnim - 2) / 1) * (-2.98822-(10.95)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.38105-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-2.47081-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.98822 + (((tickAnim - 3) / 2) * (-8.41-(-2.98822)));
            yy = 0.38105 + (((tickAnim - 3) / 2) * (0-(0.38105)));
            zz = -2.47081 + (((tickAnim - 3) / 2) * (0-(-2.47081)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -8.41 + (((tickAnim - 5) / 4) * (65.75-(-8.41)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 65.75 + (((tickAnim - 9) / 2) * (134.99-(65.75)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 134.99 + (((tickAnim - 11) / 2) * (95.73-(134.99)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 95.73 + (((tickAnim - 13) / 4) * (92.24-(95.73)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 92.24 + (((tickAnim - 17) / 3) * (24.75-(92.24)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 2) / 1) * (0.45-(0.425)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.45 + (((tickAnim - 3) / 0) * (0.41-(0.45)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 1) * (0.37-(0.41)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.37 + (((tickAnim - 4) / 5) * (0-(0.37)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0.42-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.45-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.42 + (((tickAnim - 11) / 2) * (1.01-(0.42)));
            zz = 0.45 + (((tickAnim - 11) / 2) * (0.15-(0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.01 + (((tickAnim - 13) / 4) * (0-(1.01)));
            zz = 0.15 + (((tickAnim - 13) / 4) * (0-(0.15)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18.36939 + (((tickAnim - 0) / 8) * (-35.75-(18.36939)));
            yy = -4.17952 + (((tickAnim - 0) / 8) * (0-(-4.17952)));
            zz = 3.57832 + (((tickAnim - 0) / 8) * (0-(3.57832)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -35.75 + (((tickAnim - 8) / 10) * (26.11939-(-35.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (-4.1795-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (3.5783-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 26.11939 + (((tickAnim - 18) / 2) * (18.36939-(26.11939)));
            yy = -4.1795 + (((tickAnim - 18) / 2) * (-4.17952-(-4.1795)));
            zz = 3.5783 + (((tickAnim - 18) / 2) * (3.57832-(3.5783)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 8) / 10) * (0-(0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.75 + (((tickAnim - 0) / 3) * (-39.5-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -8.75 + (((tickAnim - 0) / 3) * (-5.83333-(-8.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -39.5 + (((tickAnim - 3) / 1) * (-39.5-(-39.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -5.83333 + (((tickAnim - 3) / 1) * (-5.83333-(-5.83333)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -39.5 + (((tickAnim - 4) / 4) * (13.25-(-39.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -5.83333 + (((tickAnim - 4) / 4) * (0-(-5.83333)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 13.25 + (((tickAnim - 8) / 10) * (19.00319-(13.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (-0.3987-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-9.6671-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 19.00319 + (((tickAnim - 18) / 2) * (-4.75-(19.00319)));
            yy = -0.3987 + (((tickAnim - 18) / 2) * (0-(-0.3987)));
            zz = -9.6671 + (((tickAnim - 18) / 2) * (-8.75-(-9.6671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.8-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.025 + (((tickAnim - 3) / 1) * (-0.025-(-0.025)));
            zz = 0.8 + (((tickAnim - 3) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.025 + (((tickAnim - 4) / 4) * (0-(-0.025)));
            zz = 0.8 + (((tickAnim - 4) / 4) * (0-(0.8)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.04-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 9) / 2) * (0.35-(0.25)));
            zz = 0.04 + (((tickAnim - 9) / 2) * (0.075-(0.04)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 11) / 7) * (0-(0.35)));
            zz = 0.075 + (((tickAnim - 11) / 7) * (0-(0.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 133.5 + (((tickAnim - 0) / 4) * (85.25-(133.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 85.25 + (((tickAnim - 4) / 4) * (24.75-(85.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 8) / 3) * (3.17-(24.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 3.17 + (((tickAnim - 11) / 2) * (-8.12-(3.17)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.12 + (((tickAnim - 13) / 5) * (65.75-(-8.12)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 65.75 + (((tickAnim - 18) / 2) * (133.5-(65.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 8) * (0-(0.25)));
            zz = 0.525 + (((tickAnim - 0) / 8) * (0-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.15-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 5) * (0-(0.15)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTropidosuchus e = (EntityPrehistoricFloraTropidosuchus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
