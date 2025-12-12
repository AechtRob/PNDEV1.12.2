package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus_sibiricus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPsittacosaurus_sibiricus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer quill;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer quill2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer upperbody2;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftHorn;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightHorn;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eye;

    private ModelAnimator animator;

    public ModelPsittacosaurus_sibiricus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 11.7092F, 1.3881F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.1598F, 4.0408F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.5F, 0.0F, -7.75F, 5, 7, 8, 0.0F, false));

        this.quill = new AdvancedModelRenderer(this);
        this.quill.setRotationPoint(0.0F, -3.8092F, -2.5881F);
        this.body.addChild(quill);
        this.setRotateAngle(quill, -0.0873F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.2F, 0.1046F, 0.4027F);
        this.quill.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 54, 0.5F, -6.0F, -0.5F, 0, 6, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 54, 1.9F, -6.0F, -0.5F, 0, 6, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.1046F, 0.4027F);
        this.quill.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -1.5F, -6.0F, -0.5F, 3, 6, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.6493F, 6.6289F);
        this.quill.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 32, -1.5F, -3.0F, -6.75F, 4, 3, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.9966F, 3.4137F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 9, -2.0F, -0.0872F, -0.5038F, 4, 5, 7, 0.0F, false));

        this.quill2 = new AdvancedModelRenderer(this);
        this.quill2.setRotationPoint(-0.05F, -0.1467F, 0.7458F);
        this.tail2.addChild(quill2);
        this.setRotateAngle(quill2, -0.0873F, 0.0F, 0.0F);
        this.quill2.cubeList.add(new ModelBox(quill2, 36, 15, -0.95F, -2.9404F, -1.2496F, 2, 3, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.45F, -0.1404F, -0.7496F);
        this.quill2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, 0.0F, -6.0F, -0.5F, 1, 6, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0872F, 5.4962F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 43, -1.5F, 0.0F, 0.0F, 3, 3, 6, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 39, -1.0F, 0.1305F, -0.0086F, 2, 2, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2055F, 6.7664F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 48, 8, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.5F, -1.3599F, -1.1625F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.0873F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 46, 43, -1.5F, -0.4435F, -2.2309F, 3, 6, 4, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.7952F, -2.0065F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.3491F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 52, 29, -1.0F, -0.4435F, 0.0191F, 2, 6, 3, -0.001F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.905F, 1.7066F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6545F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 34, 0, -1.0F, -0.3685F, -1.0059F, 2, 4, 2, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 2.847F, 0.3176F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.3927F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 40, 26, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.5F, -1.3599F, -1.1625F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.0873F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 46, 43, -1.5F, -0.4435F, -2.2309F, 3, 6, 4, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.7952F, -2.0065F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3491F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 52, 29, -1.0F, -0.4435F, 0.0191F, 2, 6, 3, -0.001F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.905F, 1.7066F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6545F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 34, 0, -1.0F, -0.3685F, -1.0059F, 2, 4, 2, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 2.847F, 0.3176F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.3927F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 40, 26, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.upperbody2 = new AdvancedModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -2.9565F, -3.0094F);
        this.body.addChild(upperbody2);
        this.upperbody2.cubeList.add(new ModelBox(upperbody2, 0, 16, -3.0F, -0.9527F, -6.1287F, 6, 8, 6, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.5247F, -6.0319F);
        this.upperbody2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.1309F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.191F, 0.0724F);
        this.upperbody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 25, -2.0F, -0.066F, -6.046F, 4, 7, 6, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.5F, 5.809F, -3.1776F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.1473F, 0.4755F, -0.0678F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 19, 0, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.25F, 1.25F, 4.75F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.1309F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 0, -0.5F, -1.5F, -1.0F, 1, 4, 2, -0.01F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.1076F, 3.2825F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 26, 39, -1.0F, -0.875F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.5F, 5.809F, -3.1776F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.1473F, -0.4755F, 0.0678F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 19, 0, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.25F, 1.25F, 4.75F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.1309F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 0, -0.5F, -1.5F, -1.0F, 1, 4, 2, -0.01F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.1076F, 3.2825F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 26, 39, 0.0F, -0.875F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 1.536F, -4.291F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 46, -1.0F, 0.1556F, -2.921F, 3, 5, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5319F, -2.1279F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1833F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 17, 49, -0.5F, -0.3444F, -3.921F, 2, 3, 4, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 3.1306F, -0.171F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 53, -1.0F, -0.5F, -3.75F, 2, 1, 4, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.3275F, -3.8084F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 46, 0, -1.5F, -0.25F, -4.0F, 3, 2, 4, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 51, 22, -1.5F, 1.55F, -4.0F, 3, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 16, 1.15F, 1.775F, -3.75F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 16, -1.15F, 1.775F, -3.75F, 0, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.9163F, -5.5673F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 26, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0088F, -4.9659F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 43, -1.5F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.283F, 1.35F, -1.9095F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.8727F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 20, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 1.0168F, -4.8365F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1634F, 0.3238F, 0.1852F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 0, -2.1443F, -0.7954F, 0.376F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4F, 0.025F, -2.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3927F, 0.0F, 0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 31, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 1.0168F, -4.8365F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1634F, -0.3238F, -0.1852F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 29, 0, 0.1443F, -0.7954F, 0.376F, 2, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.25F, -4.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 53, -1.5F, 0.0F, -1.0F, 2, 2, 1, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.4F, 0.025F, -2.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, -0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 31, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.283F, 1.35F, -1.9095F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.8727F, -0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 20, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftHorn = new AdvancedModelRenderer(this);
        this.leftHorn.setRotationPoint(1.25F, 1.725F, -0.7F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, 0.053F, 0.1664F, 0.3099F);
        this.leftHorn.cubeList.add(new ModelBox(leftHorn, 25, 22, 0.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.425F, 0.0F, -1.5F);
        this.leftHorn.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.5367F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 2, 0.0F, -0.5F, 0.0F, 1, 1, 1, -0.001F, false));

        this.rightHorn = new AdvancedModelRenderer(this);
        this.rightHorn.setRotationPoint(-1.25F, 1.725F, -0.7F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, 0.053F, -0.1664F, -0.3099F);
        this.rightHorn.cubeList.add(new ModelBox(rightHorn, 25, 22, -2.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.425F, 0.0F, -1.5F);
        this.rightHorn.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.5367F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 2, -1.0F, -0.5F, 0.0F, 1, 1, 1, -0.001F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5463F, -0.7475F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 16, -1.5F, 0.0037F, -3.2525F, 3, 1, 4, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 0, 1.075F, -0.2963F, -2.8025F, 0, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 31, 1.25F, -1.9963F, -2.2525F, 0, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 0, -1.075F, -0.2963F, -2.8025F, 0, 1, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 31, -1.25F, -1.9963F, -2.2525F, 0, 2, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 54, -1.0F, -1.9963F, -1.3025F, 2, 2, 2, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.0037F, -3.2525F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 39, -0.5F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.0037F, -3.2525F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 54, -1.5F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.7F, -2.925F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 0, 57, -0.325F, -0.5F, -0.4F, 2, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 57, -1.675F, -0.5F, -0.4F, 2, 1, 1, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.1F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(220);
        this.body.rotateAngleX = (float)Math.toRadians(12);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.7F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.leftarm.setScale(0,0,0);
        this.rightarm.setScale(0,0,0);
        this.leftarm.scaleChildren = true;
        this.rightarm.scaleChildren = true;
        this.upperbody.offsetX = -0.0F;
        this.upperbody.offsetY = -0.03F;
        this.upperbody.offsetZ = -0.02F;
        this.upperbody.render(0.01F);
        this.leftarm.setScale(1,1,1);
        this.rightarm.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, 0.05F);
        this.setRotateAngle(upperbody2, 0.2F, 0.1F, 0.05F);
        this.setRotateAngle(upperbody, 0.1F, -0.1F, -0.1F);
        this.setRotateAngle(neck, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.4F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.6F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.3F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, -0.3F, 0.05F, 0.0F);
        this.setRotateAngle(tail4, 0.3F, 0.05F, 0.0F);
        this.setRotateAngle(tail5, 0.3F, 0.05F, 0.0F);
        this.setRotateAngle(leftarm, -1.0F, 0.0F, -0.7F);
        this.setRotateAngle(leftarm2, -0.9F, 0.0F, 0.2F);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm, -1.0F, 0.0F, 0.7F);
        this.setRotateAngle(rightarm2, -0.9F, 0.0F, -0.1F);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, -0.4F, -0.05F, -0.05F);
        this.setRotateAngle(leftleg2, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -2.2F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg4, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, -0.4F, 0.05F, 0.05F);
        this.setRotateAngle(rightleg2, 1.2F, 0.1F, -0.1F);
        this.setRotateAngle(rightleg3, -2.2F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg4, 1.5F, 0.0F, 0.0F);
        this.body.offsetY = -0.08F;
        this.neck2.offsetZ = 0.007F;
        this.leftleg2.offsetZ = 0.002F;
        this.leftleg3.offsetY = 0.004F;
        this.leftleg4.offsetZ = -0.003F;
        this.rightleg2.offsetZ = 0.002F;
        this.rightleg3.offsetY = 0.004F;
        this.rightleg4.offsetZ = -0.003F;
        this.body.render(0.01f);
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

        EntityPrehistoricFloraPsittacosaurus_sibiricus EntityPsittacosaurus_sibiricus = (EntityPrehistoricFloraPsittacosaurus_sibiricus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityPsittacosaurus_sibiricus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityPsittacosaurus_sibiricus.getAnimation() == EntityPsittacosaurus_sibiricus.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityPsittacosaurus_sibiricus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityPsittacosaurus_sibiricus.getIsMoving()) {
                    if (EntityPsittacosaurus_sibiricus.getAnimation() != EntityPsittacosaurus_sibiricus.EAT_ANIMATION
                        && EntityPsittacosaurus_sibiricus.getAnimation() != EntityPsittacosaurus_sibiricus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm3, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityPsittacosaurus_sibiricus.getIsFast()) { //Running


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
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraPsittacosaurus_sibiricus ee = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 8) / 5) * (3.75-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 3.75 + (((tickAnim - 13) / 3) * (-1.5-(3.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 16) / 4) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(quill, quill.rotateAngleX + (float) Math.toRadians(xx), quill.rotateAngleY + (float) Math.toRadians(yy), quill.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.75 + (((tickAnim - 8) / 5) * (4-(-3.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 4 + (((tickAnim - 13) / 3) * (-3.75-(4)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 16) / 4) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(quill2, quill2.rotateAngleX + (float) Math.toRadians(xx), quill2.rotateAngleY + (float) Math.toRadians(yy), quill2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 3) / 5) * (-3-(1.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3 + (((tickAnim - 8) / 4) * (0-(-3)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 15) / 5) * (0-(2.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 3) / 5) * (10-(1.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 8) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 15) / 5) * (0-(6.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 3) / 5) * (-8.25-(-2.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -8.25 + (((tickAnim - 8) / 4) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 15) / 5) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0.3 + (((tickAnim - 8) / 12) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5.75 + (((tickAnim - 3) / 5) * (-7.5-(-5.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.5 + (((tickAnim - 8) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0.175 + (((tickAnim - 3) / 5) * (0.28-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0.28 + (((tickAnim - 8) / 12) * (0-(0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.25 + (((tickAnim - 3) / 5) * (-1.75-(8.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 8) / 4) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -18.25 + (((tickAnim - 15) / 5) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (29.5-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29.5 + (((tickAnim - 8) / 4) * (0-(29.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (22.5-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 15) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.13098-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.99714-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.99657-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = -0.13098 + (((tickAnim - 7) / 15) * (-0.13098-(-0.13098)));
            yy = -2.99714 + (((tickAnim - 7) / 15) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 7) / 15) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.13098 + (((tickAnim - 22) / 8) * (-10.13098-(-0.13098)));
            yy = -2.99714 + (((tickAnim - 22) / 8) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 22) / 8) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.13098 + (((tickAnim - 30) / 10) * (-10.13098-(-10.13098)));
            yy = -2.99714 + (((tickAnim - 30) / 10) * (-2.99714-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 30) / 10) * (-0.99657-(-0.99657)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -10.13098 + (((tickAnim - 40) / 10) * (0-(-10.13098)));
            yy = -2.99714 + (((tickAnim - 40) / 10) * (0-(-2.99714)));
            zz = -0.99657 + (((tickAnim - 40) / 10) * (0-(-0.99657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (1.1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 1.1 + (((tickAnim - 30) / 10) * (1.1-(1.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 1.1 + (((tickAnim - 40) / 10) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.87181-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-6.38431-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (1.22344-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.87181 + (((tickAnim - 10) / 4) * (-1.48425-(-0.87181)));
            yy = -6.38431 + (((tickAnim - 10) / 4) * (0.94633-(-6.38431)));
            zz = 1.22344 + (((tickAnim - 10) / 4) * (-0.25154-(1.22344)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.48425 + (((tickAnim - 14) / 4) * (-2.16671-(-1.48425)));
            yy = 0.94633 + (((tickAnim - 14) / 4) * (-2.99794-(0.94633)));
            zz = -0.25154 + (((tickAnim - 14) / 4) * (0.61229-(-0.25154)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.16671 + (((tickAnim - 18) / 3) * (-2.55327-(-2.16671)));
            yy = -2.99794 + (((tickAnim - 18) / 3) * (-0.54032-(-2.99794)));
            zz = 0.61229 + (((tickAnim - 18) / 3) * (0.07863-(0.61229)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -2.55327 + (((tickAnim - 21) / 9) * (-3.75-(-2.55327)));
            yy = -0.54032 + (((tickAnim - 21) / 9) * (0-(-0.54032)));
            zz = 0.07863 + (((tickAnim - 21) / 9) * (0-(0.07863)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 30) / 10) * (4.38-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.38 + (((tickAnim - 40) / 10) * (0-(4.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.65527-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (11.73268-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.64223-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.65527 + (((tickAnim - 10) / 4) * (-1.11408-(-0.65527)));
            yy = 11.73268 + (((tickAnim - 10) / 4) * (-7.1518-(11.73268)));
            zz = -0.64223 + (((tickAnim - 10) / 4) * (0.52722-(-0.64223)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.11408 + (((tickAnim - 14) / 4) * (-1.6654-(-1.11408)));
            yy = -7.1518 + (((tickAnim - 14) / 4) * (11.65879-(-7.1518)));
            zz = 0.52722 + (((tickAnim - 14) / 4) * (-0.832-(0.52722)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -1.6654 + (((tickAnim - 18) / 3) * (-1.88911-(-1.6654)));
            yy = 11.65879 + (((tickAnim - 18) / 3) * (2.51258-(11.65879)));
            zz = -0.832 + (((tickAnim - 18) / 3) * (-0.14102-(-0.832)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -1.88911 + (((tickAnim - 21) / 4) * (-2.28614-(-1.88911)));
            yy = 2.51258 + (((tickAnim - 21) / 4) * (-3.11384-(2.51258)));
            zz = -0.14102 + (((tickAnim - 21) / 4) * (0.29827-(-0.14102)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.28614 + (((tickAnim - 25) / 5) * (-2.75-(-2.28614)));
            yy = -3.11384 + (((tickAnim - 25) / 5) * (0-(-3.11384)));
            zz = 0.29827 + (((tickAnim - 25) / 5) * (0-(0.29827)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 30) / 5) * (-5.06-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.06 + (((tickAnim - 35) / 5) * (7.38-(-5.06)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.38 + (((tickAnim - 40) / 10) * (0-(7.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.72921-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (13.51852-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (2.53613-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.72921 + (((tickAnim - 10) / 4) * (0.84218-(0.72921)));
            yy = 13.51852 + (((tickAnim - 10) / 4) * (-2.32002-(13.51852)));
            zz = 2.53613 + (((tickAnim - 10) / 4) * (-0.50631-(2.53613)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.84218 + (((tickAnim - 14) / 4) * (1.40434-(0.84218)));
            yy = -2.32002 + (((tickAnim - 14) / 4) * (11.35802-(-2.32002)));
            zz = -0.50631 + (((tickAnim - 14) / 4) * (2.24121-(-0.50631)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.40434 + (((tickAnim - 18) / 3) * (1.4276-(1.40434)));
            yy = 11.35802 + (((tickAnim - 18) / 3) * (1.41344-(11.35802)));
            zz = 2.24121 + (((tickAnim - 18) / 3) * (0.23216-(2.24121)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.4276 + (((tickAnim - 21) / 4) * (1.72126-(1.4276)));
            yy = 1.41344 + (((tickAnim - 21) / 4) * (-4.37002-(1.41344)));
            zz = 0.23216 + (((tickAnim - 21) / 4) * (-0.93857-(0.23216)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.72126 + (((tickAnim - 25) / 5) * (2-(1.72126)));
            yy = -4.37002 + (((tickAnim - 25) / 5) * (0-(-4.37002)));
            zz = -0.93857 + (((tickAnim - 25) / 5) * (0-(-0.93857)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 30) / 5) * (-8-(2)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -8 + (((tickAnim - 35) / 3) * (-11.16-(-8)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -11.16 + (((tickAnim - 38) / 2) * (3.67-(-11.16)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.67 + (((tickAnim - 40) / 10) * (0-(3.67)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.81326-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-22.74794-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.31449-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.81326 + (((tickAnim - 10) / 2) * (-1.11729-(-0.81326)));
            yy = -22.74794 + (((tickAnim - 10) / 2) * (22.48676-(-22.74794)));
            zz = 0.31449 + (((tickAnim - 10) / 2) * (-0.44629-(0.31449)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1.11729 + (((tickAnim - 12) / 2) * (-1.39137-(-1.11729)));
            yy = 22.48676 + (((tickAnim - 12) / 2) * (12.22702-(22.48676)));
            zz = -0.44629 + (((tickAnim - 12) / 2) * (-0.12138-(-0.44629)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -1.39137 + (((tickAnim - 14) / 2) * (-1.76969-(-1.39137)));
            yy = 12.22702 + (((tickAnim - 14) / 2) * (-19.14633-(12.22702)));
            zz = -0.12138 + (((tickAnim - 14) / 2) * (0.85722-(-0.12138)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -1.76969 + (((tickAnim - 16) / 2) * (-2.09238-(-1.76969)));
            yy = -19.14633 + (((tickAnim - 16) / 2) * (-18.10263-(-19.14633)));
            zz = 0.85722 + (((tickAnim - 16) / 2) * (0.86671-(0.85722)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.09238 + (((tickAnim - 18) / 3) * (-2.65245-(-2.09238)));
            yy = -18.10263 + (((tickAnim - 18) / 3) * (26.38666-(-18.10263)));
            zz = 0.86671 + (((tickAnim - 18) / 3) * (-1.10359-(0.86671)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -2.65245 + (((tickAnim - 21) / 4) * (0-(-2.65245)));
            yy = 26.38666 + (((tickAnim - 21) / 4) * (-5-(26.38666)));
            zz = -1.10359 + (((tickAnim - 21) / 4) * (0-(-1.10359)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (7.25-(0)));
            yy = -5 + (((tickAnim - 25) / 5) * (0-(-5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 30) / 5) * (-2.31-(7.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2.31 + (((tickAnim - 35) / 3) * (-3.05-(-2.31)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -3.05 + (((tickAnim - 38) / 1) * (-8.04-(-3.05)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -8.04 + (((tickAnim - 39) / 3) * (12.71-(-8.04)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 12.71 + (((tickAnim - 42) / 8) * (0-(12.71)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -16 + (((tickAnim - 7) / 5) * (39-(-16)));
            yy = -6.75 + (((tickAnim - 7) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 39 + (((tickAnim - 12) / 5) * (-16-(39)));
            yy = -6.75 + (((tickAnim - 12) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -16 + (((tickAnim - 17) / 5) * (39-(-16)));
            yy = -6.75 + (((tickAnim - 17) / 5) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 39 + (((tickAnim - 22) / 8) * (39-(39)));
            yy = -6.75 + (((tickAnim - 22) / 8) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39 + (((tickAnim - 30) / 10) * (39-(39)));
            yy = -6.75 + (((tickAnim - 30) / 10) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 40) / 10) * (0-(39)));
            yy = -6.75 + (((tickAnim - 40) / 10) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -28.25 + (((tickAnim - 7) / 5) * (5-(-28.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 12) / 2) * (-35.33-(5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -35.33 + (((tickAnim - 14) / 3) * (-28.25-(-35.33)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -28.25 + (((tickAnim - 17) / 7) * (-7.57-(-28.25)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -7.57 + (((tickAnim - 24) / 6) * (-27.75-(-7.57)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -27.75 + (((tickAnim - 40) / 3) * (-3.8408-(-27.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (1.24062-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.61371-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -3.8408 + (((tickAnim - 43) / 2) * (-23.93159-(-3.8408)));
            yy = 1.24062 + (((tickAnim - 43) / 2) * (2.48123-(1.24062)));
            zz = 0.61371 + (((tickAnim - 43) / 2) * (1.22742-(0.61371)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -23.93159 + (((tickAnim - 45) / 5) * (0-(-23.93159)));
            yy = 2.48123 + (((tickAnim - 45) / 5) * (0-(2.48123)));
            zz = 1.22742 + (((tickAnim - 45) / 5) * (0-(1.22742)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0.675-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 43) / 7) * (0-(0.675)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-50.87-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -50.87 + (((tickAnim - 3) / 4) * (16.75-(-50.87)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 16.75 + (((tickAnim - 7) / 5) * (-12.25-(16.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -12.25 + (((tickAnim - 12) / 2) * (-66.38-(-12.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -66.38 + (((tickAnim - 14) / 3) * (16.75-(-66.38)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 16.75 + (((tickAnim - 17) / 5) * (-12.25-(16.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -12.25 + (((tickAnim - 22) / 2) * (3.15-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 3.15 + (((tickAnim - 24) / 6) * (12.25-(3.15)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.25 + (((tickAnim - 30) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 12.25 + (((tickAnim - 40) / 3) * (-74.43-(12.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -74.43 + (((tickAnim - 43) / 2) * (-70.12-(-74.43)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -70.12 + (((tickAnim - 45) / 5) * (0-(-70.12)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 12) / 1) * (0.53-(0.275)));
            zz = 0.425 + (((tickAnim - 12) / 1) * (0.98-(0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.53 + (((tickAnim - 13) / 1) * (0-(0.53)));
            zz = 0.98 + (((tickAnim - 13) / 1) * (0-(0.98)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 22) / 8) * (0-(0.175)));
            zz = 0.525 + (((tickAnim - 22) / 8) * (0-(0.525)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (97-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 97 + (((tickAnim - 3) / 4) * (34-(97)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 34 + (((tickAnim - 7) / 2) * (1-(34)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 9) / 3) * (90-(1)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 90 + (((tickAnim - 12) / 1) * (75.63-(90)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 75.63 + (((tickAnim - 13) / 1) * (104.08-(75.63)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 104.08 + (((tickAnim - 14) / 3) * (34-(104.08)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 34 + (((tickAnim - 17) / 2) * (0-(34)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (5.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 5.5 + (((tickAnim - 22) / 2) * (29.18-(5.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 29.18 + (((tickAnim - 24) / 6) * (-13-(29.18)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13 + (((tickAnim - 30) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -13 + (((tickAnim - 40) / 3) * (91.44-(-13)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 91.44 + (((tickAnim - 43) / 2) * (85.13-(91.44)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 85.13 + (((tickAnim - 45) / 5) * (0-(85.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.525-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -0.525 + (((tickAnim - 3) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (1.025-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.025 + (((tickAnim - 12) / 1) * (2.02-(1.025)));
            zz = -0.425 + (((tickAnim - 12) / 1) * (-0.07-(-0.425)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 2.02 + (((tickAnim - 13) / 1) * (0-(2.02)));
            zz = -0.07 + (((tickAnim - 13) / 1) * (0-(-0.07)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.225-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.225 + (((tickAnim - 22) / 8) * (-0.3-(0.225)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 40) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.25 + (((tickAnim - 30) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 40) / 10) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -14.25 + (((tickAnim - 30) / 10) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 40) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (27.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 27.75 + (((tickAnim - 30) / 10) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27.75 + (((tickAnim - 40) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (6.25-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 30) / 10) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 40) / 10) * (0-(6.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 30) / 10) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.35 + (((tickAnim - 40) / 10) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 4 + (((tickAnim - 7) / 5) * (4.00547-(4)));
            yy = 0 + (((tickAnim - 7) / 5) * (2.99269-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.20946-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 4.00547 + (((tickAnim - 12) / 5) * (4-(4.00547)));
            yy = 2.99269 + (((tickAnim - 12) / 5) * (0-(2.99269)));
            zz = 0.20946 + (((tickAnim - 12) / 5) * (0-(0.20946)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 4 + (((tickAnim - 17) / 5) * (4.00547-(4)));
            yy = 0 + (((tickAnim - 17) / 5) * (2.99269-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.20946-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 4.00547 + (((tickAnim - 22) / 8) * (12.80454-(4.00547)));
            yy = 2.99269 + (((tickAnim - 22) / 8) * (0.1591-(2.99269)));
            zz = 0.20946 + (((tickAnim - 22) / 8) * (-1.84832-(0.20946)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.80454 + (((tickAnim - 30) / 10) * (12.80454-(12.80454)));
            yy = 0.1591 + (((tickAnim - 30) / 10) * (0.1591-(0.1591)));
            zz = -1.84832 + (((tickAnim - 30) / 10) * (-1.84832-(-1.84832)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.80454 + (((tickAnim - 40) / 10) * (0-(12.80454)));
            yy = 0.1591 + (((tickAnim - 40) / 10) * (0-(0.1591)));
            zz = -1.84832 + (((tickAnim - 40) / 10) * (0-(-1.84832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 7) / 5) * (8.72192-(8.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (-6.98494-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.4601-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 8.72192 + (((tickAnim - 12) / 5) * (8.75-(8.72192)));
            yy = -6.98494 + (((tickAnim - 12) / 5) * (0-(-6.98494)));
            zz = 0.4601 + (((tickAnim - 12) / 5) * (0-(0.4601)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 8.75 + (((tickAnim - 17) / 5) * (8.72192-(8.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (-6.98494-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.4601-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 8.72192 + (((tickAnim - 22) / 8) * (14-(8.72192)));
            yy = -6.98494 + (((tickAnim - 22) / 8) * (0-(-6.98494)));
            zz = 0.4601 + (((tickAnim - 22) / 8) * (0-(0.4601)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 14 + (((tickAnim - 30) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-44.816-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-5.53413-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (13.07071-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -44.816 + (((tickAnim - 30) / 3) * (-44.10939-(-44.816)));
            yy = -5.53413 + (((tickAnim - 30) / 3) * (-4.97969-(-5.53413)));
            zz = 13.07071 + (((tickAnim - 30) / 3) * (10.37938-(13.07071)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -44.10939 + (((tickAnim - 33) / 2) * (-44.816-(-44.10939)));
            yy = -4.97969 + (((tickAnim - 33) / 2) * (-5.53413-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 33) / 2) * (13.07071-(10.37938)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -44.816 + (((tickAnim - 35) / 3) * (-44.10939-(-44.816)));
            yy = -5.53413 + (((tickAnim - 35) / 3) * (-4.97969-(-5.53413)));
            zz = 13.07071 + (((tickAnim - 35) / 3) * (10.37938-(13.07071)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -44.10939 + (((tickAnim - 38) / 2) * (-44.816-(-44.10939)));
            yy = -4.97969 + (((tickAnim - 38) / 2) * (-5.53413-(-4.97969)));
            zz = 10.37938 + (((tickAnim - 38) / 2) * (13.07071-(10.37938)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -44.816 + (((tickAnim - 40) / 10) * (0-(-44.816)));
            yy = -5.53413 + (((tickAnim - 40) / 10) * (0-(-5.53413)));
            zz = 13.07071 + (((tickAnim - 40) / 10) * (0-(13.07071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (52.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 52.75 + (((tickAnim - 30) / 3) * (28.06276-(52.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (-18.27011-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (23.99775-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 28.06276 + (((tickAnim - 33) / 2) * (34.5-(28.06276)));
            yy = -18.27011 + (((tickAnim - 33) / 2) * (0-(-18.27011)));
            zz = 23.99775 + (((tickAnim - 33) / 2) * (0-(23.99775)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 34.5 + (((tickAnim - 35) / 3) * (28.06276-(34.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (-18.27011-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (23.99775-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 28.06276 + (((tickAnim - 38) / 2) * (34.5-(28.06276)));
            yy = -18.27011 + (((tickAnim - 38) / 2) * (0-(-18.27011)));
            zz = 23.99775 + (((tickAnim - 38) / 2) * (0-(23.99775)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 40) / 10) * (0-(34.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 20) * (0-(0.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (-53-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = -53 + (((tickAnim - 30) / 3) * (18-(-53)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 18 + (((tickAnim - 33) / 2) * (-53-(18)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = -53 + (((tickAnim - 35) / 3) * (18-(-53)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 18 + (((tickAnim - 38) / 2) * (-53-(18)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -53 + (((tickAnim - 40) / 10) * (0-(-53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0.625-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0.275-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0.625 + (((tickAnim - 30) / 3) * (-0.2-(0.625)));
            yy = 0.275 + (((tickAnim - 30) / 3) * (0.125-(0.275)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.2 + (((tickAnim - 33) / 2) * (0.625-(-0.2)));
            yy = 0.125 + (((tickAnim - 33) / 2) * (0.275-(0.125)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.625 + (((tickAnim - 35) / 3) * (-0.2-(0.625)));
            yy = 0.275 + (((tickAnim - 35) / 3) * (0.125-(0.275)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -0.2 + (((tickAnim - 38) / 2) * (0.625-(-0.2)));
            yy = 0.125 + (((tickAnim - 38) / 2) * (0.275-(0.125)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.625 + (((tickAnim - 40) / 10) * (0-(0.625)));
            yy = 0.275 + (((tickAnim - 40) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm3.rotationPointX = this.leftarm3.rotationPointX + (float)(xx);
        this.leftarm3.rotationPointY = this.leftarm3.rotationPointY - (float)(yy);
        this.leftarm3.rotationPointZ = this.leftarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -40.75 + (((tickAnim - 30) / 3) * (-51.58971-(-40.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (-0.56748-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-8.79922-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -51.58971 + (((tickAnim - 33) / 2) * (-40.75-(-51.58971)));
            yy = -0.56748 + (((tickAnim - 33) / 2) * (0-(-0.56748)));
            zz = -8.79922 + (((tickAnim - 33) / 2) * (0-(-8.79922)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -40.75 + (((tickAnim - 35) / 3) * (-51.58971-(-40.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (-0.56748-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (-8.79922-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -51.58971 + (((tickAnim - 38) / 2) * (-40.75-(-51.58971)));
            yy = -0.56748 + (((tickAnim - 38) / 2) * (0-(-0.56748)));
            zz = -8.79922 + (((tickAnim - 38) / 2) * (0-(-8.79922)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -40.75 + (((tickAnim - 40) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (34.25-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 34.25 + (((tickAnim - 33) / 2) * (32.02777-(34.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (36.34287-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (-21.02882-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 32.02777 + (((tickAnim - 35) / 3) * (34.25-(32.02777)));
            yy = 36.34287 + (((tickAnim - 35) / 3) * (0-(36.34287)));
            zz = -21.02882 + (((tickAnim - 35) / 3) * (0-(-21.02882)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 34.25 + (((tickAnim - 38) / 2) * (32.02777-(34.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (36.34287-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-21.02882-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32.02777 + (((tickAnim - 40) / 10) * (0-(32.02777)));
            yy = 36.34287 + (((tickAnim - 40) / 10) * (0-(36.34287)));
            zz = -21.02882 + (((tickAnim - 40) / 10) * (0-(-21.02882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-8.90956-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (5.67589-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (30.72319-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -8.90956 + (((tickAnim - 33) / 2) * (0-(-8.90956)));
            yy = 5.67589 + (((tickAnim - 33) / 2) * (0-(5.67589)));
            zz = 30.72319 + (((tickAnim - 33) / 2) * (0-(30.72319)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-8.90956-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (5.67589-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (30.72319-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -8.90956 + (((tickAnim - 38) / 2) * (0-(-8.90956)));
            yy = 5.67589 + (((tickAnim - 38) / 2) * (0-(5.67589)));
            zz = 30.72319 + (((tickAnim - 38) / 2) * (0-(30.72319)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.35 + (((tickAnim - 33) / 2) * (0-(-0.35)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -0.35 + (((tickAnim - 38) / 2) * (0-(-0.35)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(xx);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(yy);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.72217-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-19.06236-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (9.8817-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 9.72217 + (((tickAnim - 7) / 15) * (9.72217-(9.72217)));
            yy = -19.06236 + (((tickAnim - 7) / 15) * (-19.06236-(-19.06236)));
            zz = 9.8817 + (((tickAnim - 7) / 15) * (9.8817-(9.8817)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 9.72217 + (((tickAnim - 22) / 8) * (32-(9.72217)));
            yy = -19.06236 + (((tickAnim - 22) / 8) * (0-(-19.06236)));
            zz = 9.8817 + (((tickAnim - 22) / 8) * (0-(9.8817)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 32 + (((tickAnim - 30) / 10) * (32-(32)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 40) / 10) * (0-(32)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.40385-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-23.68749-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.25637-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 3.40385 + (((tickAnim - 7) / 15) * (3.40385-(3.40385)));
            yy = -23.68749 + (((tickAnim - 7) / 15) * (-23.68749-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 7) / 15) * (-6.25637-(-6.25637)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 3.40385 + (((tickAnim - 22) / 18) * (3.40385-(3.40385)));
            yy = -23.68749 + (((tickAnim - 22) / 18) * (-23.68749-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 22) / 18) * (-6.25637-(-6.25637)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.40385 + (((tickAnim - 40) / 10) * (0-(3.40385)));
            yy = -23.68749 + (((tickAnim - 40) / 10) * (0-(-23.68749)));
            zz = -6.25637 + (((tickAnim - 40) / 10) * (0-(-6.25637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -13.25 + (((tickAnim - 10) / 25) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 35) / 15) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -4.125 + (((tickAnim - 10) / 25) * (-4.125-(-4.125)));
            zz = 0.45 + (((tickAnim - 10) / 25) * (0.45-(0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 35) / 15) * (0-(-4.125)));
            zz = 0.45 + (((tickAnim - 35) / 15) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -9.75 + (((tickAnim - 10) / 25) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 35) / 15) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.50276-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.24935-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.07431-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 3.50276 + (((tickAnim - 10) / 25) * (3.50276-(3.50276)));
            yy = -4.24935 + (((tickAnim - 10) / 25) * (-4.24935-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 10) / 25) * (-0.07431-(-0.07431)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.50276 + (((tickAnim - 35) / 15) * (0-(3.50276)));
            yy = -4.24935 + (((tickAnim - 35) / 15) * (0-(-4.24935)));
            zz = -0.07431 + (((tickAnim - 35) / 15) * (0-(-0.07431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.46609-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.49226-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.35309-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 6.46609 + (((tickAnim - 10) / 25) * (6.46609-(6.46609)));
            yy = -10.49226 + (((tickAnim - 10) / 25) * (-10.49226-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 10) / 25) * (-2.35309-(-2.35309)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 6.46609 + (((tickAnim - 35) / 5) * (-19.25-(6.46609)));
            yy = -10.49226 + (((tickAnim - 35) / 5) * (0-(-10.49226)));
            zz = -2.35309 + (((tickAnim - 35) / 5) * (0-(-2.35309)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 40) / 10) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.14829-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.66118-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.45207-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 7.14829 + (((tickAnim - 10) / 25) * (7.14829-(7.14829)));
            yy = -11.66118 + (((tickAnim - 10) / 25) * (-11.66118-(-11.66118)));
            zz = -1.45207 + (((tickAnim - 10) / 25) * (-1.45207-(-1.45207)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.14829 + (((tickAnim - 35) / 5) * (7.33-(7.14829)));
            yy = -11.66118 + (((tickAnim - 35) / 5) * (0-(-11.66118)));
            zz = -1.45207 + (((tickAnim - 35) / 5) * (0-(-1.45207)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 7.33 + (((tickAnim - 40) / 3) * (-21.36-(7.33)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -21.36 + (((tickAnim - 43) / 7) * (0-(-21.36)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = -0.35 + (((tickAnim - 10) / 25) * (-0.35-(-0.35)));
            zz = -0.45 + (((tickAnim - 10) / 25) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.35 + (((tickAnim - 35) / 15) * (0-(-0.35)));
            zz = -0.45 + (((tickAnim - 35) / 15) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.95882-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.89494-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.72902-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 5.95882 + (((tickAnim - 10) / 25) * (5.95882-(5.95882)));
            yy = -7.89494 + (((tickAnim - 10) / 25) * (-7.89494-(-7.89494)));
            zz = -2.72902 + (((tickAnim - 10) / 25) * (-2.72902-(-2.72902)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.95882 + (((tickAnim - 35) / 15) * (0-(5.95882)));
            yy = -7.89494 + (((tickAnim - 35) / 15) * (0-(-7.89494)));
            zz = -2.72902 + (((tickAnim - 35) / 15) * (0-(-2.72902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 10) / 25) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-77.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -77.25 + (((tickAnim - 10) / 25) * (-77.25-(-77.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -77.25 + (((tickAnim - 35) / 15) * (0-(-77.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (67.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 67.5 + (((tickAnim - 10) / 25) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 67.5 + (((tickAnim - 35) / 15) * (0-(67.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.9588-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.8949-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.729-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -5.9588 + (((tickAnim - 10) / 25) * (-5.9588-(-5.9588)));
            yy = 7.8949 + (((tickAnim - 10) / 25) * (7.8949-(7.8949)));
            zz = 2.729 + (((tickAnim - 10) / 25) * (2.729-(2.729)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.9588 + (((tickAnim - 35) / 15) * (0-(-5.9588)));
            yy = 7.8949 + (((tickAnim - 35) / 15) * (0-(7.8949)));
            zz = 2.729 + (((tickAnim - 35) / 15) * (0-(2.729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 10) / 25) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-64.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -64.75 + (((tickAnim - 10) / 25) * (-64.75-(-64.75)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -64.75 + (((tickAnim - 35) / 15) * (0-(-64.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (66-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 66 + (((tickAnim - 10) / 25) * (66-(66)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 66 + (((tickAnim - 35) / 15) * (0-(66)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 10) / 25) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 10) / 25) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 35) / 15) * (0-(12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.36464-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05869-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (8.66245-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -2.36464 + (((tickAnim - 10) / 25) * (-2.36464-(-2.36464)));
            yy = -0.05869 + (((tickAnim - 10) / 25) * (-0.05869-(-0.05869)));
            zz = 8.66245 + (((tickAnim - 10) / 25) * (8.66245-(8.66245)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.36464 + (((tickAnim - 35) / 15) * (0-(-2.36464)));
            yy = -0.05869 + (((tickAnim - 35) / 15) * (0-(-0.05869)));
            zz = 8.66245 + (((tickAnim - 35) / 15) * (0-(8.66245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -4.25 + (((tickAnim - 10) / 25) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 35) / 15) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 1.25 + (((tickAnim - 10) / 25) * (1.25-(1.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
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
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 10) / 25) * (-8-(-8)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 35) / 15) * (0-(-8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 13.5 + (((tickAnim - 10) / 25) * (13.5-(13.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -14.25 + (((tickAnim - 10) / 25) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.25 + (((tickAnim - 35) / 15) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 1.35 + (((tickAnim - 10) / 25) * (1.35-(1.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 1.35 + (((tickAnim - 35) / 15) * (0-(1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 125;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 113) {
            xx = 4.25 + (((tickAnim - 30) / 83) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 30) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 83) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 4.25 + (((tickAnim - 113) / 12) * (0-(4.25)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.375-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 30) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 83) * (0-(0)));
            zz = 0.375 + (((tickAnim - 30) / 83) * (0.375-(0.375)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0.375 + (((tickAnim - 113) / 12) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 30) / 30) * (-2.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-3-(2.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = -2.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-3 + (((tickAnim - 60) / 9) * (-5.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-3-(-2.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-3)));
            yy = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 113) {
            xx = -5.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-3 + (((tickAnim - 69) / 44) * (4.5-(-5.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-3)));
            yy = 0 + (((tickAnim - 69) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 44) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 4.5 + (((tickAnim - 113) / 12) * (0-(4.5)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 6.5 + (((tickAnim - 30) / 9) * (8.5-(6.5)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = 8.5 + (((tickAnim - 39) / 10) * (9.75-(8.5)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 9.75 + (((tickAnim - 49) / 11) * (7.25-(9.75)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = 7.25 + (((tickAnim - 60) / 9) * (5.04246-(7.25)));
            yy = 0 + (((tickAnim - 60) / 9) * (0.24651-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (-0.36331-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 79) {
            xx = 5.04246 + (((tickAnim - 69) / 10) * (1.48961-(5.04246)));
            yy = 0.24651 + (((tickAnim - 69) / 10) * (0.26334-(0.24651)));
            zz = -0.36331 + (((tickAnim - 69) / 10) * (-0.38811-(-0.36331)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = 1.48961 + (((tickAnim - 79) / 34) * (11.04246-(1.48961)));
            yy = 0.26334 + (((tickAnim - 79) / 34) * (0.24651-(0.26334)));
            zz = -0.38811 + (((tickAnim - 79) / 34) * (-0.36331-(-0.38811)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 11.04246 + (((tickAnim - 113) / 12) * (0-(11.04246)));
            yy = 0.24651 + (((tickAnim - 113) / 12) * (0-(0.24651)));
            zz = -0.36331 + (((tickAnim - 113) / 12) * (0-(-0.36331)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -11.75 + (((tickAnim - 30) / 9) * (-8.25-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -8.25 + (((tickAnim - 39) / 10) * (-6.25-(-8.25)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -6.25 + (((tickAnim - 49) / 11) * (-2.75-(-6.25)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 69) {
            xx = -2.75 + (((tickAnim - 60) / 9) * (-7.25-(-2.75)));
            yy = 0 + (((tickAnim - 60) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 9) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 79) {
            xx = -7.25 + (((tickAnim - 69) / 10) * (-12.52-(-7.25)));
            yy = 0 + (((tickAnim - 69) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 10) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = -12.52 + (((tickAnim - 79) / 34) * (-13.75-(-12.52)));
            yy = 0 + (((tickAnim - 79) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 34) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -13.75 + (((tickAnim - 113) / 12) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -12 + (((tickAnim - 30) / 9) * (-9.75-(-12)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -9.75 + (((tickAnim - 39) / 10) * (-4.5-(-9.75)));
            yy = 0 + (((tickAnim - 39) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 10) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -4.5 + (((tickAnim - 49) / 11) * (-6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(-4.5)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = -6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 60) / 19) * (-11.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-6.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 113) {
            xx = -11.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 79) / 34) * (-7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-5-(-11.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 79) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 34) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-5 + (((tickAnim - 113) / 12) * (0-(-7.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-5)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 113) {
            xx = -5.25 + (((tickAnim - 30) / 83) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 83) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -5.25 + (((tickAnim - 113) / 12) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 113) {
            xx = -5.25 + (((tickAnim - 30) / 83) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 83) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -5.25 + (((tickAnim - 113) / 12) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 30) / 19) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(14.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 61) {
            xx = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 49) / 12) * (0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*1-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 49) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 12) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*1 + (((tickAnim - 61) / 15) * (0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*2-(0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*1)));
            yy = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*2 + (((tickAnim - 76) / 14) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*2)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 90) / 23) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*2-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*2 + (((tickAnim - 113) / 12) * (0-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*2)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 9.25 + (((tickAnim - 30) / 19) * (5.75-(9.25)));
            yy = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 61) {
            xx = 5.75 + (((tickAnim - 49) / 12) * (-1.15-(5.75)));
            yy = 0 + (((tickAnim - 49) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 12) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = -1.15 + (((tickAnim - 61) / 15) * (5.75-(-1.15)));
            yy = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 5.75 + (((tickAnim - 76) / 14) * (4.25-(5.75)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 4.25 + (((tickAnim - 90) / 23) * (-1-(4.25)));
            yy = 0 + (((tickAnim - 90) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 23) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = -1 + (((tickAnim - 113) / 12) * (0-(-1)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 125) {
            xx = 16.25 + (((tickAnim - 30) / 95) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 125) {
            xx = -21.75 + (((tickAnim - 30) / 95) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 30) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 125) {
            xx = 16.25 + (((tickAnim - 30) / 95) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 125) {
            xx = -21.75 + (((tickAnim - 30) / 95) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 30) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 30) / 10) * (33.5-(8.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 33.5 + (((tickAnim - 40) / 9) * (23.5-(33.5)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 61) {
            xx = 23.5 + (((tickAnim - 49) / 12) * (31.35-(23.5)));
            yy = 0 + (((tickAnim - 49) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 12) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 31.35 + (((tickAnim - 61) / 15) * (33.5-(31.35)));
            yy = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 33.5 + (((tickAnim - 76) / 14) * (24.75-(33.5)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 24.75 + (((tickAnim - 90) / 10) * (33.5-(24.75)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = 33.5 + (((tickAnim - 100) / 3) * (29.5-(33.5)));
            yy = 0 + (((tickAnim - 100) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 3) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 29.5 + (((tickAnim - 103) / 10) * (22.75-(29.5)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 22.75 + (((tickAnim - 113) / 12) * (0-(22.75)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.375-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = -1.375 + (((tickAnim - 40) / 36) * (-1.375-(-1.375)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            zz = -1.375 + (((tickAnim - 76) / 24) * (-1.375-(-1.375)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            zz = -1.375 + (((tickAnim - 100) / 25) * (0-(-1.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 30) / 10) * (26.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-3.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 26.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 40) / 9) * (-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*13-(26.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 61) {
            xx = -1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*13 + (((tickAnim - 49) / 12) * (6.35-(-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*13)));
            yy = 0 + (((tickAnim - 49) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 12) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 6.35 + (((tickAnim - 61) / 15) * (26.25-(6.35)));
            yy = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 26.25 + (((tickAnim - 76) / 14) * (27.25-(26.25)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 27.25 + (((tickAnim - 90) / 10) * (26.25-(27.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = 26.25 + (((tickAnim - 100) / 3) * (17.75-(26.25)));
            yy = 0 + (((tickAnim - 100) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 3) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 17.75 + (((tickAnim - 103) / 10) * (6.25-(17.75)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 6.25 + (((tickAnim - 113) / 12) * (0-(6.25)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 16.25 + (((tickAnim - 30) / 10) * (-5.5-(16.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -5.5 + (((tickAnim - 40) / 9) * (15.75-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 76) {
            xx = 15.75 + (((tickAnim - 49) / 27) * (-5.5-(15.75)));
            yy = 0 + (((tickAnim - 49) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 27) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = -5.5 + (((tickAnim - 76) / 14) * (2.25-(-5.5)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 2.25 + (((tickAnim - 90) / 10) * (-5.5-(2.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = -5.5 + (((tickAnim - 100) / 3) * (7-(-5.5)));
            yy = 0 + (((tickAnim - 100) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 3) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 7 + (((tickAnim - 103) / 10) * (17.5-(7)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 125) {
            xx = 17.5 + (((tickAnim - 113) / 12) * (0-(17.5)));
            yy = 0 + (((tickAnim - 113) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (28.75-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 28.75 + (((tickAnim - 38) / 2) * (0-(28.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (11.5-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 11.5 + (((tickAnim - 42) / 1) * (0-(11.5)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 49) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 20) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 69) / 4) * (25.25-(0)));
            yy = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 4) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 25.25 + (((tickAnim - 73) / 3) * (0-(25.25)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 76) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 17) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 93) / 5) * (25.25-(0)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = 25.25 + (((tickAnim - 98) / 2) * (0-(25.25)));
            yy = 0 + (((tickAnim - 98) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 100) / 2) * (16-(0)));
            yy = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 2) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 103) {
            xx = 16 + (((tickAnim - 102) / 1) * (0-(16)));
            yy = 0 + (((tickAnim - 102) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 44 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 44) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 44) / 3) * (0.025-(1)));
            zz = 1 + (((tickAnim - 44) / 3) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 47) / 2) * (1-(1)));
            yy = 0.025 + (((tickAnim - 47) / 2) * (1-(0.025)));
            zz = 1 + (((tickAnim - 47) / 2) * (1-(1)));
        }
        else if (tickAnim >= 49 && tickAnim < 86) {
            xx = 1 + (((tickAnim - 49) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 49) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 49) / 37) * (1-(1)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 86) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 86) / 2) * (0.025-(1)));
            zz = 1 + (((tickAnim - 86) / 2) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 1 + (((tickAnim - 88) / 3) * (1-(1)));
            yy = 0.025 + (((tickAnim - 88) / 3) * (1-(0.025)));
            zz = 1 + (((tickAnim - 88) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 710;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-9.3322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.69927-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-2.125-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -9.3322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 19) / 16) * (-4.75-(-9.3322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
            yy = 0.69927 + (((tickAnim - 19) / 16) * (1.25-(0.69927)));
            zz = -2.125 + (((tickAnim - 19) / 16) * (0-(-2.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = -4.75 + (((tickAnim - 35) / 185) * (-4.75-(-4.75)));
            yy = 1.25 + (((tickAnim - 35) / 185) * (1.25-(1.25)));
            zz = 0 + (((tickAnim - 35) / 185) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -4.75 + (((tickAnim - 220) / 15) * (-4.86657-(-4.75)));
            yy = 1.25 + (((tickAnim - 220) / 15) * (0.66252-(1.25)));
            zz = 0 + (((tickAnim - 220) / 15) * (-6.97631-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -4.86657 + (((tickAnim - 235) / 27) * (-4.58622-(-4.86657)));
            yy = 0.66252 + (((tickAnim - 235) / 27) * (1.75915-(0.66252)));
            zz = -6.97631 + (((tickAnim - 235) / 27) * (6.2314-(-6.97631)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = -4.58622 + (((tickAnim - 262) / 28) * (-4.59383-(-4.58622)));
            yy = 1.75915 + (((tickAnim - 262) / 28) * (1.73914-(1.75915)));
            zz = 6.2314 + (((tickAnim - 262) / 28) * (5.98208-(6.2314)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = -4.59383 + (((tickAnim - 290) / 29) * (-4.59383-(-4.59383)));
            yy = 1.73914 + (((tickAnim - 290) / 29) * (1.73914-(1.73914)));
            zz = 5.98208 + (((tickAnim - 290) / 29) * (5.98208-(5.98208)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -4.59383 + (((tickAnim - 319) / 316) * (-4.59383-(-4.59383)));
            yy = 1.73914 + (((tickAnim - 319) / 316) * (1.73914-(1.73914)));
            zz = 5.98208 + (((tickAnim - 319) / 316) * (5.98208-(5.98208)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -4.59383 + (((tickAnim - 635) / 15) * (-4.59383-(-4.59383)));
            yy = 1.73914 + (((tickAnim - 635) / 15) * (1.73914-(1.73914)));
            zz = 5.98208 + (((tickAnim - 635) / 15) * (5.98208-(5.98208)));
        }
        else if (tickAnim >= 650 && tickAnim < 670) {
            xx = -4.59383 + (((tickAnim - 650) / 20) * (-4.59383-(-4.59383)));
            yy = 1.73914 + (((tickAnim - 650) / 20) * (1.73914-(1.73914)));
            zz = 5.98208 + (((tickAnim - 650) / 20) * (5.98208-(5.98208)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = -4.59383 + (((tickAnim - 670) / 13) * (-3.45583-(-4.59383)));
            yy = 1.73914 + (((tickAnim - 670) / 13) * (2.03381-(1.73914)));
            zz = 5.98208 + (((tickAnim - 670) / 13) * (14.61821-(5.98208)));
        }
        else if (tickAnim >= 683 && tickAnim < 710) {
            xx = -3.45583 + (((tickAnim - 683) / 27) * (0-(-3.45583)));
            yy = 2.03381 + (((tickAnim - 683) / 27) * (0-(2.03381)));
            zz = 14.61821 + (((tickAnim - 683) / 27) * (0-(14.61821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-5.105-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.41+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = -5.105 + (((tickAnim - 19) / 16) * (-6.575-(-5.105)));
            zz = -0.41+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 19) / 16) * (0.85-(-0.41+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            yy = -6.575 + (((tickAnim - 35) / 185) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 35) / 185) * (0.85-(0.85)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 220) / 15) * (0-(0)));
            yy = -6.575 + (((tickAnim - 220) / 15) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 220) / 15) * (0.85-(0.85)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 235) / 27) * (0-(0)));
            yy = -6.575 + (((tickAnim - 235) / 27) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 235) / 27) * (0.85-(0.85)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            yy = -6.575 + (((tickAnim - 262) / 57) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 262) / 57) * (0.85-(0.85)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = -6.575 + (((tickAnim - 319) / 316) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 319) / 316) * (0.85-(0.85)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = -6.575 + (((tickAnim - 635) / 15) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 635) / 15) * (0.85-(0.85)));
        }
        else if (tickAnim >= 650 && tickAnim < 670) {
            xx = 0 + (((tickAnim - 650) / 20) * (0-(0)));
            yy = -6.575 + (((tickAnim - 650) / 20) * (-6.575-(-6.575)));
            zz = 0.85 + (((tickAnim - 650) / 20) * (0.85-(0.85)));
        }
        else if (tickAnim >= 670 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 670) / 40) * (0-(0)));
            yy = -6.575 + (((tickAnim - 670) / 40) * (0-(-6.575)));
            zz = 0.85 + (((tickAnim - 670) / 40) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-7.5453-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (4.05296-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.28014-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = -7.5453 + (((tickAnim - 35) / 185) * (-7.5453-(-7.5453)));
            yy = 4.05296 + (((tickAnim - 35) / 185) * (4.05296-(4.05296)));
            zz = -1.28014 + (((tickAnim - 35) / 185) * (-1.28014-(-1.28014)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -7.5453 + (((tickAnim - 220) / 15) * (-7.40648-(-7.5453)));
            yy = 4.05296 + (((tickAnim - 220) / 15) * (1.90228-(4.05296)));
            zz = -1.28014 + (((tickAnim - 220) / 15) * (4.38182-(-1.28014)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -7.40648 + (((tickAnim - 235) / 27) * (-7.04453-(-7.40648)));
            yy = 1.90228 + (((tickAnim - 235) / 27) * (-3.61489-(1.90228)));
            zz = 4.38182 + (((tickAnim - 235) / 27) * (-4.11434-(4.38182)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -7.04453 + (((tickAnim - 262) / 57) * (-7.04453-(-7.04453)));
            yy = -3.61489 + (((tickAnim - 262) / 57) * (-3.61489-(-3.61489)));
            zz = -4.11434 + (((tickAnim - 262) / 57) * (-4.11434-(-4.11434)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -7.04453 + (((tickAnim - 319) / 316) * (-7.04453-(-7.04453)));
            yy = -3.61489 + (((tickAnim - 319) / 316) * (-3.61489-(-3.61489)));
            zz = -4.11434 + (((tickAnim - 319) / 316) * (-4.11434-(-4.11434)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -7.04453 + (((tickAnim - 635) / 15) * (-7.04453-(-7.04453)));
            yy = -3.61489 + (((tickAnim - 635) / 15) * (-3.61489-(-3.61489)));
            zz = -4.11434 + (((tickAnim - 635) / 15) * (-4.11434-(-4.11434)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = -7.04453 + (((tickAnim - 650) / 9) * (-7.04453-(-7.04453)));
            yy = -3.61489 + (((tickAnim - 650) / 9) * (-3.61489-(-3.61489)));
            zz = -4.11434 + (((tickAnim - 650) / 9) * (-4.11434-(-4.11434)));
        }
        else if (tickAnim >= 659 && tickAnim < 697) {
            xx = -7.04453 + (((tickAnim - 659) / 38) * (-4.22625-(-7.04453)));
            yy = -3.61489 + (((tickAnim - 659) / 38) * (9.6903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*25-(-3.61489)));
            zz = -4.11434 + (((tickAnim - 659) / 38) * (-9.25118-(-4.11434)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = -4.22625 + (((tickAnim - 697) / 13) * (0-(-4.22625)));
            yy = 9.6903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*25 + (((tickAnim - 697) / 13) * (0-(9.6903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*25)));
            zz = -9.25118 + (((tickAnim - 697) / 13) * (0-(-9.25118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (1.81268-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (3.5614-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.99209-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 1.81268 + (((tickAnim - 19) / 16) * (-8.10294-(1.81268)));
            yy = 3.5614 + (((tickAnim - 19) / 16) * (6.50343-(3.5614)));
            zz = -0.99209 + (((tickAnim - 19) / 16) * (-1.81165-(-0.99209)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = -8.10294 + (((tickAnim - 35) / 185) * (-8.10294-(-8.10294)));
            yy = 6.50343 + (((tickAnim - 35) / 185) * (6.50343-(6.50343)));
            zz = -1.81165 + (((tickAnim - 35) / 185) * (-1.81165-(-1.81165)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -8.10294 + (((tickAnim - 220) / 15) * (-7.92396-(-8.10294)));
            yy = 6.50343 + (((tickAnim - 220) / 15) * (2.94251-(6.50343)));
            zz = -1.81165 + (((tickAnim - 220) / 15) * (1.26116-(-1.81165)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -7.92396 + (((tickAnim - 235) / 27) * (-6.42189-(-7.92396)));
            yy = 2.94251 + (((tickAnim - 235) / 27) * (-8.91795-(2.94251)));
            zz = 1.26116 + (((tickAnim - 235) / 27) * (-8.5314-(1.26116)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -6.42189 + (((tickAnim - 262) / 57) * (-6.42189-(-6.42189)));
            yy = -8.91795 + (((tickAnim - 262) / 57) * (-8.91795-(-8.91795)));
            zz = -8.5314 + (((tickAnim - 262) / 57) * (-8.5314-(-8.5314)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -6.42189 + (((tickAnim - 319) / 316) * (-6.42189-(-6.42189)));
            yy = -8.91795 + (((tickAnim - 319) / 316) * (-8.91795-(-8.91795)));
            zz = -8.5314 + (((tickAnim - 319) / 316) * (-8.5314-(-8.5314)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -6.42189 + (((tickAnim - 635) / 15) * (-6.42189-(-6.42189)));
            yy = -8.91795 + (((tickAnim - 635) / 15) * (-8.91795-(-8.91795)));
            zz = -8.5314 + (((tickAnim - 635) / 15) * (-8.5314-(-8.5314)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = -6.42189 + (((tickAnim - 650) / 9) * (-6.42189-(-6.42189)));
            yy = -8.91795 + (((tickAnim - 650) / 9) * (-8.91795-(-8.91795)));
            zz = -8.5314 + (((tickAnim - 650) / 9) * (-8.5314-(-8.5314)));
        }
        else if (tickAnim >= 659 && tickAnim < 697) {
            xx = -6.42189 + (((tickAnim - 659) / 38) * (0.20424-(-6.42189)));
            yy = -8.91795 + (((tickAnim - 659) / 38) * (17.71292-(-8.91795)));
            zz = -8.5314 + (((tickAnim - 659) / 38) * (4.51261-(-8.5314)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 0.20424 + (((tickAnim - 697) / 13) * (0-(0.20424)));
            yy = 17.71292 + (((tickAnim - 697) / 13) * (0-(17.71292)));
            zz = 4.51261 + (((tickAnim - 697) / 13) * (0-(4.51261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (14.24989-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.85724-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (4.43491-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 14.24989 + (((tickAnim - 19) / 7) * (19.56277-(14.24989)));
            yy = 0.85724 + (((tickAnim - 19) / 7) * (1.20483-(0.85724)));
            zz = 4.43491 + (((tickAnim - 19) / 7) * (6.23316-(4.43491)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 19.56277 + (((tickAnim - 26) / 9) * (16.89111-(19.56277)));
            yy = 1.20483 + (((tickAnim - 26) / 9) * (1.5654-(1.20483)));
            zz = 6.23316 + (((tickAnim - 26) / 9) * (8.09854-(6.23316)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 16.89111 + (((tickAnim - 35) / 185) * (16.89111-(16.89111)));
            yy = 1.5654 + (((tickAnim - 35) / 185) * (1.5654-(1.5654)));
            zz = 8.09854 + (((tickAnim - 35) / 185) * (8.09854-(8.09854)));
        }
        else if (tickAnim >= 220 && tickAnim < 262) {
            xx = 16.89111 + (((tickAnim - 220) / 42) * (16.15691-(16.89111)));
            yy = 1.5654 + (((tickAnim - 220) / 42) * (-5.29389-(1.5654)));
            zz = 8.09854 + (((tickAnim - 220) / 42) * (-7.20745-(8.09854)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 16.15691 + (((tickAnim - 262) / 57) * (16.15691-(16.15691)));
            yy = -5.29389 + (((tickAnim - 262) / 57) * (-5.29389-(-5.29389)));
            zz = -7.20745 + (((tickAnim - 262) / 57) * (-7.20745-(-7.20745)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 16.15691 + (((tickAnim - 319) / 316) * (16.15691-(16.15691)));
            yy = -5.29389 + (((tickAnim - 319) / 316) * (-5.29389-(-5.29389)));
            zz = -7.20745 + (((tickAnim - 319) / 316) * (-7.20745-(-7.20745)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 16.15691 + (((tickAnim - 635) / 15) * (16.15691-(16.15691)));
            yy = -5.29389 + (((tickAnim - 635) / 15) * (-5.29389-(-5.29389)));
            zz = -7.20745 + (((tickAnim - 635) / 15) * (-7.20745-(-7.20745)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 16.15691 + (((tickAnim - 650) / 9) * (16.15691-(16.15691)));
            yy = -5.29389 + (((tickAnim - 650) / 9) * (-5.29389-(-5.29389)));
            zz = -7.20745 + (((tickAnim - 650) / 9) * (-7.20745-(-7.20745)));
        }
        else if (tickAnim >= 659 && tickAnim < 697) {
            xx = 16.15691 + (((tickAnim - 659) / 38) * (9.50254-(16.15691)));
            yy = -5.29389 + (((tickAnim - 659) / 38) * (28.91423-(-5.29389)));
            zz = -7.20745 + (((tickAnim - 659) / 38) * (5.77135-(-7.20745)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 9.50254 + (((tickAnim - 697) / 13) * (0-(9.50254)));
            yy = 28.91423 + (((tickAnim - 697) / 13) * (0-(28.91423)));
            zz = 5.77135 + (((tickAnim - 697) / 13) * (0-(5.77135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (3.28571-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 19) / 16) * (0-(4.5)));
            yy = 3.28571 + (((tickAnim - 19) / 16) * (6-(3.28571)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            yy = 6 + (((tickAnim - 35) / 185) * (6-(6)));
            zz = 0 + (((tickAnim - 35) / 185) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 220) / 15) * (0-(0)));
            yy = 6 + (((tickAnim - 220) / 15) * (13.74-(6)));
            zz = 0 + (((tickAnim - 220) / 15) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 235) / 27) * (0-(0)));
            yy = 13.74 + (((tickAnim - 235) / 27) * (-41.25-(13.74)));
            zz = 0 + (((tickAnim - 235) / 27) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            yy = -41.25 + (((tickAnim - 262) / 57) * (-41.25-(-41.25)));
            zz = 0 + (((tickAnim - 262) / 57) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = -41.25 + (((tickAnim - 319) / 316) * (-41.25-(-41.25)));
            zz = 0 + (((tickAnim - 319) / 316) * (0-(0)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = -41.25 + (((tickAnim - 635) / 15) * (-41.25-(-41.25)));
            zz = 0 + (((tickAnim - 635) / 15) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            yy = -41.25 + (((tickAnim - 650) / 9) * (-41.25-(-41.25)));
            zz = 0 + (((tickAnim - 650) / 9) * (0-(0)));
        }
        else if (tickAnim >= 659 && tickAnim < 697) {
            xx = 0 + (((tickAnim - 659) / 38) * (0-(0)));
            yy = -41.25 + (((tickAnim - 659) / 38) * (30-(-41.25)));
            zz = 0 + (((tickAnim - 659) / 38) * (0-(0)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 697) / 13) * (0-(0)));
            yy = 30 + (((tickAnim - 697) / 13) * (0-(30)));
            zz = 0 + (((tickAnim - 697) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-7-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = -33.25 + (((tickAnim - 35) / 185) * (-33.25-(-33.25)));
            yy = -7 + (((tickAnim - 35) / 185) * (-7-(-7)));
            zz = 0 + (((tickAnim - 35) / 185) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -33.25 + (((tickAnim - 220) / 15) * (-42.0923-(-33.25)));
            yy = -7 + (((tickAnim - 220) / 15) * (-13.04918-(-7)));
            zz = 0 + (((tickAnim - 220) / 15) * (-0.01211-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -42.0923 + (((tickAnim - 235) / 27) * (-41.08403-(-42.0923)));
            yy = -13.04918 + (((tickAnim - 235) / 27) * (-7.89082-(-13.04918)));
            zz = -0.01211 + (((tickAnim - 235) / 27) * (-5.5508-(-0.01211)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -41.08403 + (((tickAnim - 262) / 57) * (-41.08403-(-41.08403)));
            yy = -7.89082 + (((tickAnim - 262) / 57) * (-7.89082-(-7.89082)));
            zz = -5.5508 + (((tickAnim - 262) / 57) * (-5.5508-(-5.5508)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -41.08403 + (((tickAnim - 319) / 316) * (-41.08403-(-41.08403)));
            yy = -7.89082 + (((tickAnim - 319) / 316) * (-7.89082-(-7.89082)));
            zz = -5.5508 + (((tickAnim - 319) / 316) * (-5.5508-(-5.5508)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -41.08403 + (((tickAnim - 635) / 15) * (-41.08403-(-41.08403)));
            yy = -7.89082 + (((tickAnim - 635) / 15) * (-7.89082-(-7.89082)));
            zz = -5.5508 + (((tickAnim - 635) / 15) * (-5.5508-(-5.5508)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = -41.08403 + (((tickAnim - 650) / 9) * (-41.08403-(-41.08403)));
            yy = -7.89082 + (((tickAnim - 650) / 9) * (-7.89082-(-7.89082)));
            zz = -5.5508 + (((tickAnim - 650) / 9) * (-5.5508-(-5.5508)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = -41.08403 + (((tickAnim - 659) / 11) * (-41.08403-(-41.08403)));
            yy = -7.89082 + (((tickAnim - 659) / 11) * (-7.89082-(-7.89082)));
            zz = -5.5508 + (((tickAnim - 659) / 11) * (-5.5508-(-5.5508)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = -41.08403 + (((tickAnim - 670) / 13) * (-31.08963-(-41.08403)));
            yy = -7.89082 + (((tickAnim - 670) / 13) * (-15.8753-(-7.89082)));
            zz = -5.5508 + (((tickAnim - 670) / 13) * (-17.08309-(-5.5508)));
        }
        else if (tickAnim >= 683 && tickAnim < 710) {
            xx = -31.08963 + (((tickAnim - 683) / 27) * (0-(-31.08963)));
            yy = -15.8753 + (((tickAnim - 683) / 27) * (0-(-15.8753)));
            zz = -17.08309 + (((tickAnim - 683) / 27) * (0-(-17.08309)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (53.2-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 53.2 + (((tickAnim - 19) / 16) * (66.5-(53.2)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 66.5 + (((tickAnim - 35) / 185) * (66.5-(66.5)));
            yy = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 185) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 66.5 + (((tickAnim - 220) / 15) * (58.25-(66.5)));
            yy = 0 + (((tickAnim - 220) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 15) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 58.25 + (((tickAnim - 235) / 27) * (66.5-(58.25)));
            yy = 0 + (((tickAnim - 235) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 27) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 66.5 + (((tickAnim - 262) / 57) * (66.5-(66.5)));
            yy = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 57) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 66.5 + (((tickAnim - 319) / 316) * (66.5-(66.5)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 316) * (0-(0)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 66.5 + (((tickAnim - 635) / 15) * (66.5-(66.5)));
            yy = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 635) / 15) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 66.5 + (((tickAnim - 650) / 9) * (66.5-(66.5)));
            yy = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 9) * (0-(0)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 66.5 + (((tickAnim - 659) / 11) * (66.5-(66.5)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 659) / 11) * (0-(0)));
        }
        else if (tickAnim >= 670 && tickAnim < 710) {
            xx = 66.5 + (((tickAnim - 670) / 40) * (0-(66.5)));
            yy = 0 + (((tickAnim - 670) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 670) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.2-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            zz = 0.2 + (((tickAnim - 35) / 185) * (0.2-(0.2)));
        }
        else if (tickAnim >= 220 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 220) / 490) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 490) * (0-(0)));
            zz = 0.2 + (((tickAnim - 220) / 490) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-34.9762-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.63576-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.37416-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -34.9762 + (((tickAnim - 13) / 10) * (-70.41963-(-34.9762)));
            yy = -2.63576 + (((tickAnim - 13) / 10) * (-5.33274-(-2.63576)));
            zz = 2.37416 + (((tickAnim - 13) / 10) * (4.80347-(2.37416)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -70.41963 + (((tickAnim - 23) / 12) * (-94.75444-(-70.41963)));
            yy = -5.33274 + (((tickAnim - 23) / 12) * (-7.99911-(-5.33274)));
            zz = 4.80347 + (((tickAnim - 23) / 12) * (7.2052-(4.80347)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = -94.75444 + (((tickAnim - 35) / 185) * (-94.75444-(-94.75444)));
            yy = -7.99911 + (((tickAnim - 35) / 185) * (-7.99911-(-7.99911)));
            zz = 7.2052 + (((tickAnim - 35) / 185) * (7.2052-(7.2052)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -94.75444 + (((tickAnim - 220) / 15) * (-67.25444-(-94.75444)));
            yy = -7.99911 + (((tickAnim - 220) / 15) * (-7.99911-(-7.99911)));
            zz = 7.2052 + (((tickAnim - 220) / 15) * (7.2052-(7.2052)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -67.25444 + (((tickAnim - 235) / 27) * (-88.56551-(-67.25444)));
            yy = -7.99911 + (((tickAnim - 235) / 27) * (-16.12555-(-7.99911)));
            zz = 7.2052 + (((tickAnim - 235) / 27) * (8.78787-(7.2052)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -88.56551 + (((tickAnim - 262) / 57) * (-88.56551-(-88.56551)));
            yy = -16.12555 + (((tickAnim - 262) / 57) * (-16.12555-(-16.12555)));
            zz = 8.78787 + (((tickAnim - 262) / 57) * (8.78787-(8.78787)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -88.56551 + (((tickAnim - 319) / 316) * (-88.56551-(-88.56551)));
            yy = -16.12555 + (((tickAnim - 319) / 316) * (-16.12555-(-16.12555)));
            zz = 8.78787 + (((tickAnim - 319) / 316) * (8.78787-(8.78787)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -88.56551 + (((tickAnim - 635) / 15) * (-88.56551-(-88.56551)));
            yy = -16.12555 + (((tickAnim - 635) / 15) * (-16.12555-(-16.12555)));
            zz = 8.78787 + (((tickAnim - 635) / 15) * (8.78787-(8.78787)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = -88.56551 + (((tickAnim - 650) / 9) * (-88.56551-(-88.56551)));
            yy = -16.12555 + (((tickAnim - 650) / 9) * (-16.12555-(-16.12555)));
            zz = 8.78787 + (((tickAnim - 650) / 9) * (8.78787-(8.78787)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = -88.56551 + (((tickAnim - 659) / 11) * (-88.56551-(-88.56551)));
            yy = -16.12555 + (((tickAnim - 659) / 11) * (-16.12555-(-16.12555)));
            zz = 8.78787 + (((tickAnim - 659) / 11) * (8.78787-(8.78787)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = -88.56551 + (((tickAnim - 670) / 13) * (-70.79491-(-88.56551)));
            yy = -16.12555 + (((tickAnim - 670) / 13) * (-13.16308-(-16.12555)));
            zz = 8.78787 + (((tickAnim - 670) / 13) * (7.17342-(8.78787)));
        }
        else if (tickAnim >= 683 && tickAnim < 710) {
            xx = -70.79491 + (((tickAnim - 683) / 27) * (0-(-70.79491)));
            yy = -13.16308 + (((tickAnim - 683) / 27) * (0-(-13.16308)));
            zz = 7.17342 + (((tickAnim - 683) / 27) * (0-(7.17342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.3-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            yy = -0.925 + (((tickAnim - 35) / 185) * (-0.925-(-0.925)));
            zz = -0.3 + (((tickAnim - 35) / 185) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 220) / 15) * (0-(0)));
            yy = -0.925 + (((tickAnim - 220) / 15) * (0.47-(-0.925)));
            zz = -0.3 + (((tickAnim - 220) / 15) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 235) / 27) * (0-(0)));
            yy = 0.47 + (((tickAnim - 235) / 27) * (-0.53-(0.47)));
            zz = -0.3 + (((tickAnim - 235) / 27) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            yy = -0.53 + (((tickAnim - 262) / 57) * (-0.53-(-0.53)));
            zz = -0.3 + (((tickAnim - 262) / 57) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = -0.53 + (((tickAnim - 319) / 316) * (-0.53-(-0.53)));
            zz = -0.3 + (((tickAnim - 319) / 316) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = -0.53 + (((tickAnim - 635) / 15) * (-0.53-(-0.53)));
            zz = -0.3 + (((tickAnim - 635) / 15) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            yy = -0.53 + (((tickAnim - 650) / 9) * (-0.53-(-0.53)));
            zz = -0.3 + (((tickAnim - 650) / 9) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            yy = -0.53 + (((tickAnim - 659) / 11) * (-0.53-(-0.53)));
            zz = -0.3 + (((tickAnim - 659) / 11) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 670 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 670) / 40) * (0-(0)));
            yy = -0.53 + (((tickAnim - 670) / 40) * (0-(-0.53)));
            zz = -0.3 + (((tickAnim - 670) / 40) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (67-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 67 + (((tickAnim - 35) / 185) * (67-(67)));
            yy = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 185) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 67 + (((tickAnim - 220) / 15) * (75.25-(67)));
            yy = 0 + (((tickAnim - 220) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 15) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 75.25 + (((tickAnim - 235) / 27) * (67.5-(75.25)));
            yy = 0 + (((tickAnim - 235) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 27) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 67.5 + (((tickAnim - 262) / 57) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 57) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 67.5 + (((tickAnim - 319) / 316) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 316) * (0-(0)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 67.5 + (((tickAnim - 635) / 15) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 635) / 15) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 67.5 + (((tickAnim - 650) / 9) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 9) * (0-(0)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 67.5 + (((tickAnim - 659) / 11) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 659) / 11) * (0-(0)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = 67.5 + (((tickAnim - 670) / 13) * (61.1-(67.5)));
            yy = 0 + (((tickAnim - 670) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 670) / 13) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 710) {
            xx = 61.1 + (((tickAnim - 683) / 27) * (0-(61.1)));
            yy = 0 + (((tickAnim - 683) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.75-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = -0.75 + (((tickAnim - 12) / 11) * (-0.615-(-0.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = -0.615 + (((tickAnim - 23) / 12) * (-0.5-(-0.615)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 185) * (0-(0)));
            zz = -0.5 + (((tickAnim - 35) / 185) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 220 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 220) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 42) * (0-(0)));
            zz = -0.5 + (((tickAnim - 220) / 42) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            zz = -0.25 + (((tickAnim - 262) / 57) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = -0.25 + (((tickAnim - 319) / 316) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            zz = -0.25 + (((tickAnim - 635) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            zz = -0.25 + (((tickAnim - 650) / 9) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = -0.25 + (((tickAnim - 659) / 11) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 670 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 670) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 670) / 40) * (0-(0)));
            zz = -0.25 + (((tickAnim - 670) / 40) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (13-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 220) {
            xx = -35.75 + (((tickAnim - 35) / 185) * (-35.75-(-35.75)));
            yy = 13 + (((tickAnim - 35) / 185) * (13-(13)));
            zz = 0 + (((tickAnim - 35) / 185) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -35.75 + (((tickAnim - 220) / 15) * (-33.22662-(-35.75)));
            yy = 13 + (((tickAnim - 220) / 15) * (20.00964-(13)));
            zz = 0 + (((tickAnim - 220) / 15) * (8.84933-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -33.22662 + (((tickAnim - 235) / 27) * (-34.91353-(-33.22662)));
            yy = 20.00964 + (((tickAnim - 235) / 27) * (34.81882-(20.00964)));
            zz = 8.84933 + (((tickAnim - 235) / 27) * (-3.60722-(8.84933)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -34.91353 + (((tickAnim - 262) / 57) * (-34.91353-(-34.91353)));
            yy = 34.81882 + (((tickAnim - 262) / 57) * (34.81882-(34.81882)));
            zz = -3.60722 + (((tickAnim - 262) / 57) * (-3.60722-(-3.60722)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -34.91353 + (((tickAnim - 319) / 316) * (-34.91353-(-34.91353)));
            yy = 34.81882 + (((tickAnim - 319) / 316) * (34.81882-(34.81882)));
            zz = -3.60722 + (((tickAnim - 319) / 316) * (-3.60722-(-3.60722)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -34.91353 + (((tickAnim - 635) / 15) * (-34.91353-(-34.91353)));
            yy = 34.81882 + (((tickAnim - 635) / 15) * (34.81882-(34.81882)));
            zz = -3.60722 + (((tickAnim - 635) / 15) * (-3.60722-(-3.60722)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = -34.91353 + (((tickAnim - 650) / 9) * (-34.91353-(-34.91353)));
            yy = 34.81882 + (((tickAnim - 650) / 9) * (34.81882-(34.81882)));
            zz = -3.60722 + (((tickAnim - 650) / 9) * (-3.60722-(-3.60722)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = -34.91353 + (((tickAnim - 659) / 11) * (-34.91353-(-34.91353)));
            yy = 34.81882 + (((tickAnim - 659) / 11) * (34.81882-(34.81882)));
            zz = -3.60722 + (((tickAnim - 659) / 11) * (-3.60722-(-3.60722)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = -34.91353 + (((tickAnim - 670) / 13) * (-14.06812-(-34.91353)));
            yy = 34.81882 + (((tickAnim - 670) / 13) * (8.68236-(34.81882)));
            zz = -3.60722 + (((tickAnim - 670) / 13) * (-11.88344-(-3.60722)));
        }
        else if (tickAnim >= 683 && tickAnim < 689) {
            xx = -14.06812 + (((tickAnim - 683) / 6) * (1.93188-(-14.06812)));
            yy = 8.68236 + (((tickAnim - 683) / 6) * (8.68236-(8.68236)));
            zz = -11.88344 + (((tickAnim - 683) / 6) * (-11.88344-(-11.88344)));
        }
        else if (tickAnim >= 689 && tickAnim < 710) {
            xx = 1.93188 + (((tickAnim - 689) / 21) * (0-(1.93188)));
            yy = 8.68236 + (((tickAnim - 689) / 21) * (0-(8.68236)));
            zz = -11.88344 + (((tickAnim - 689) / 21) * (0-(-11.88344)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (53.2-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 53.2 + (((tickAnim - 19) / 16) * (67.75-(53.2)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 262) {
            xx = 67.75 + (((tickAnim - 35) / 227) * (65-(67.75)));
            yy = 0 + (((tickAnim - 35) / 227) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 227) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = 65 + (((tickAnim - 262) / 57) * (65-(65)));
            yy = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 57) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 65 + (((tickAnim - 319) / 316) * (65-(65)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 316) * (0-(0)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 65 + (((tickAnim - 635) / 15) * (65-(65)));
            yy = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 635) / 15) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = 65 + (((tickAnim - 650) / 9) * (65-(65)));
            yy = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 9) * (0-(0)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 65 + (((tickAnim - 659) / 11) * (65-(65)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 659) / 11) * (0-(0)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = 65 + (((tickAnim - 670) / 13) * (68.31-(65)));
            yy = 0 + (((tickAnim - 670) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 670) / 13) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 689) {
            xx = 68.31 + (((tickAnim - 683) / 6) * (32-(68.31)));
            yy = 0 + (((tickAnim - 683) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 6) * (0-(0)));
        }
        else if (tickAnim >= 689 && tickAnim < 710) {
            xx = 32 + (((tickAnim - 689) / 21) * (0-(32)));
            yy = 0 + (((tickAnim - 689) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 689) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 35) / 648) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 648) * (0-(0)));
            zz = 0.25 + (((tickAnim - 35) / 648) * (0.245-(0.25)));
        }
        else if (tickAnim >= 683 && tickAnim < 689) {
            xx = 0 + (((tickAnim - 683) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 6) * (0-(0)));
            zz = 0.245 + (((tickAnim - 683) / 6) * (0-(0.245)));
        }
        else if (tickAnim >= 689 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 689) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 689) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 689) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-34.2262-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -34.2262 + (((tickAnim - 13) / 10) * (-72-(-34.2262)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -72 + (((tickAnim - 23) / 12) * (-94.49996-(-72)));
            yy = 0 + (((tickAnim - 23) / 12) * (-0.00022-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (-0.00455-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 262) {
            xx = -94.49996 + (((tickAnim - 35) / 227) * (-90.75-(-94.49996)));
            yy = -0.00022 + (((tickAnim - 35) / 227) * (0-(-0.00022)));
            zz = -0.00455 + (((tickAnim - 35) / 227) * (0-(-0.00455)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -90.75 + (((tickAnim - 262) / 57) * (-90.75-(-90.75)));
            yy = 0 + (((tickAnim - 262) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 57) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -90.75 + (((tickAnim - 319) / 316) * (-90.75-(-90.75)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 316) * (0-(0)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -90.75 + (((tickAnim - 635) / 15) * (-90.75-(-90.75)));
            yy = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 635) / 15) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 659) {
            xx = -90.75 + (((tickAnim - 650) / 9) * (-90.75-(-90.75)));
            yy = 0 + (((tickAnim - 650) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 9) * (0-(0)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = -90.75 + (((tickAnim - 659) / 11) * (-90.75-(-90.75)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 659) / 11) * (0-(0)));
        }
        else if (tickAnim >= 670 && tickAnim < 673) {
            xx = -90.75 + (((tickAnim - 670) / 3) * (-85.82-(-90.75)));
            yy = 0 + (((tickAnim - 670) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 670) / 3) * (0-(0)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = -85.82 + (((tickAnim - 673) / 10) * (7.42-(-85.82)));
            yy = 0 + (((tickAnim - 673) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 673) / 10) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 689) {
            xx = 7.42 + (((tickAnim - 683) / 6) * (0.76-(7.42)));
            yy = 0 + (((tickAnim - 683) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 6) * (0-(0)));
        }
        else if (tickAnim >= 689 && tickAnim < 710) {
            xx = 0.76 + (((tickAnim - 689) / 21) * (0-(0.76)));
            yy = 0 + (((tickAnim - 689) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 689) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.375-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 670) {
            xx = 0 + (((tickAnim - 35) / 635) * (0-(0)));
            yy = -0.95 + (((tickAnim - 35) / 635) * (-0.845-(-0.95)));
            zz = -0.375 + (((tickAnim - 35) / 635) * (-0.725-(-0.375)));
        }
        else if (tickAnim >= 670 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 670) / 13) * (0-(0)));
            yy = -0.845 + (((tickAnim - 670) / 13) * (0-(-0.845)));
            zz = -0.725 + (((tickAnim - 670) / 13) * (0-(-0.725)));
        }
        else if (tickAnim >= 683 && tickAnim < 689) {
            xx = 0 + (((tickAnim - 683) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 6) * (0.075-(0)));
            zz = 0 + (((tickAnim - 683) / 6) * (0.3-(0)));
        }
        else if (tickAnim >= 689 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 689) / 21) * (0-(0)));
            yy = 0.075 + (((tickAnim - 689) / 21) * (0-(0.075)));
            zz = 0.3 + (((tickAnim - 689) / 21) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (68-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 659) {
            xx = 68 + (((tickAnim - 35) / 624) * (68.11-(68)));
            yy = 0 + (((tickAnim - 35) / 624) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 624) * (0-(0)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 68.11 + (((tickAnim - 659) / 11) * (68.11-(68.11)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 659) / 11) * (0-(0)));
        }
        else if (tickAnim >= 670 && tickAnim < 673) {
            xx = 68.11 + (((tickAnim - 670) / 3) * (72.94189-(68.11)));
            yy = 0 + (((tickAnim - 670) / 3) * (1.11595-(0)));
            zz = 0 + (((tickAnim - 670) / 3) * (-0.56998-(0)));
        }
        else if (tickAnim >= 673 && tickAnim < 678) {
            xx = 72.94189 + (((tickAnim - 673) / 5) * (28.24117-(72.94189)));
            yy = 1.11595 + (((tickAnim - 673) / 5) * (3.11206-(1.11595)));
            zz = -0.56998 + (((tickAnim - 673) / 5) * (-1.5895-(-0.56998)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = 28.24117 + (((tickAnim - 678) / 5) * (-18.02381-(28.24117)));
            yy = 3.11206 + (((tickAnim - 678) / 5) * (3.67409-(3.11206)));
            zz = -1.5895 + (((tickAnim - 678) / 5) * (-1.98865-(-1.5895)));
        }
        else if (tickAnim >= 683 && tickAnim < 689) {
            xx = -18.02381 + (((tickAnim - 683) / 6) * (-27.82424-(-18.02381)));
            yy = 3.67409 + (((tickAnim - 683) / 6) * (6.75259-(3.67409)));
            zz = -1.98865 + (((tickAnim - 683) / 6) * (-4.18071-(-1.98865)));
        }
        else if (tickAnim >= 689 && tickAnim < 710) {
            xx = -27.82424 + (((tickAnim - 689) / 21) * (0-(-27.82424)));
            yy = 6.75259 + (((tickAnim - 689) / 21) * (0-(6.75259)));
            zz = -4.18071 + (((tickAnim - 689) / 21) * (0-(-4.18071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.715-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = -0.715 + (((tickAnim - 12) / 11) * (-0.38-(-0.715)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = -0.38 + (((tickAnim - 23) / 12) * (-0.425-(-0.38)));
        }
        else if (tickAnim >= 35 && tickAnim < 659) {
            xx = 0 + (((tickAnim - 35) / 624) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 624) * (0-(0)));
            zz = -0.425 + (((tickAnim - 35) / 624) * (-0.585-(-0.425)));
        }
        else if (tickAnim >= 659 && tickAnim < 670) {
            xx = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 659) / 11) * (0-(0)));
            zz = -0.585 + (((tickAnim - 659) / 11) * (-0.585-(-0.585)));
        }
        else if (tickAnim >= 670 && tickAnim < 673) {
            xx = 0 + (((tickAnim - 670) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 670) / 3) * (1.635-(0)));
            zz = -0.585 + (((tickAnim - 670) / 3) * (-1.03-(-0.585)));
        }
        else if (tickAnim >= 673 && tickAnim < 678) {
            xx = 0 + (((tickAnim - 673) / 5) * (0-(0)));
            yy = 1.635 + (((tickAnim - 673) / 5) * (1.925-(1.635)));
            zz = -1.03 + (((tickAnim - 673) / 5) * (-0.44-(-1.03)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            yy = 1.925 + (((tickAnim - 678) / 5) * (0.2-(1.925)));
            zz = -0.44 + (((tickAnim - 678) / 5) * (0.425-(-0.44)));
        }
        else if (tickAnim >= 683 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 683) / 27) * (0-(0)));
            yy = 0.2 + (((tickAnim - 683) / 27) * (0-(0.2)));
            zz = 0.425 + (((tickAnim - 683) / 27) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (2.21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 2.21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 19) / 16) * (3.5-(2.21+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 59) {
            xx = 3.5 + (((tickAnim - 35) / 24) * (2.5-(3.5)));
            yy = 0 + (((tickAnim - 35) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 24) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = 2.5 + (((tickAnim - 59) / 29) * (3.5-(2.5)));
            yy = 0 + (((tickAnim - 59) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 29) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 112) {
            xx = 3.5 + (((tickAnim - 88) / 24) * (2.5-(3.5)));
            yy = 0 + (((tickAnim - 88) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 24) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 2.5 + (((tickAnim - 112) / 28) * (2.3753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(2.5)));
            yy = 0 + (((tickAnim - 112) / 28) * (-0.7486-(0)));
            zz = 0 + (((tickAnim - 112) / 28) * (-0.04579-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = 2.3753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 140) / 13) * (0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(2.3753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = -0.7486 + (((tickAnim - 140) / 13) * (0-(-0.7486)));
            zz = -0.04579 + (((tickAnim - 140) / 13) * (0-(-0.04579)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = 0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 153) / 13) * (-1-(0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 153) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 13) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = -1 + (((tickAnim - 166) / 14) * (-0.5-(-1)));
            yy = 0 + (((tickAnim - 166) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 14) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -0.5 + (((tickAnim - 180) / 40) * (-1-(-0.5)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -1 + (((tickAnim - 220) / 15) * (1.726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(-1)));
            yy = 0 + (((tickAnim - 220) / 15) * (-0.04362-(0)));
            zz = 0 + (((tickAnim - 220) / 15) * (-2.49962-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 1.726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 235) / 27) * (9.7472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*2-(1.726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = -0.04362 + (((tickAnim - 235) / 27) * (-0.85469-(-0.04362)));
            zz = -2.49962 + (((tickAnim - 235) / 27) * (1.16176-(-2.49962)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = 9.7472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*2 + (((tickAnim - 262) / 28) * (13.884-(9.7472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*2)));
            yy = -0.85469 + (((tickAnim - 262) / 28) * (8.39415-(-0.85469)));
            zz = 1.16176 + (((tickAnim - 262) / 28) * (1.7908-(1.16176)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 13.884 + (((tickAnim - 290) / 29) * (13.884-(13.884)));
            yy = 8.39415 + (((tickAnim - 290) / 29) * (8.39415-(8.39415)));
            zz = 1.7908 + (((tickAnim - 290) / 29) * (1.7908-(1.7908)));
        }
        else if (tickAnim >= 319 && tickAnim < 380) {
            xx = 13.884 + (((tickAnim - 319) / 61) * (12.634-(13.884)));
            yy = 8.39415 + (((tickAnim - 319) / 61) * (8.39415-(8.39415)));
            zz = 1.7908 + (((tickAnim - 319) / 61) * (1.7908-(1.7908)));
        }
        else if (tickAnim >= 380 && tickAnim < 450) {
            xx = 12.634 + (((tickAnim - 380) / 70) * (13.884-(12.634)));
            yy = 8.39415 + (((tickAnim - 380) / 70) * (8.39415-(8.39415)));
            zz = 1.7908 + (((tickAnim - 380) / 70) * (1.7908-(1.7908)));
        }
        else if (tickAnim >= 450 && tickAnim < 548) {
            xx = 13.884 + (((tickAnim - 450) / 98) * (12.634-(13.884)));
            yy = 8.39415 + (((tickAnim - 450) / 98) * (8.39415-(8.39415)));
            zz = 1.7908 + (((tickAnim - 450) / 98) * (1.7908-(1.7908)));
        }
        else if (tickAnim >= 548 && tickAnim < 635) {
            xx = 12.634 + (((tickAnim - 548) / 87) * (13.884-(12.634)));
            yy = 8.39415 + (((tickAnim - 548) / 87) * (8.39415-(8.39415)));
            zz = 1.7908 + (((tickAnim - 548) / 87) * (1.7908-(1.7908)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 13.884 + (((tickAnim - 635) / 15) * (-0.39912-(13.884)));
            yy = 8.39415 + (((tickAnim - 635) / 15) * (6.15845-(8.39415)));
            zz = 1.7908 + (((tickAnim - 635) / 15) * (-5.26937-(1.7908)));
        }
        else if (tickAnim >= 650 && tickAnim < 670) {
            xx = -0.39912 + (((tickAnim - 650) / 20) * (0.85088-(-0.39912)));
            yy = 6.15845 + (((tickAnim - 650) / 20) * (6.15845-(6.15845)));
            zz = -5.26937 + (((tickAnim - 650) / 20) * (-5.26937-(-5.26937)));
        }
        else if (tickAnim >= 670 && tickAnim < 697) {
            xx = 0.85088 + (((tickAnim - 670) / 27) * (9.0148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*10-(0.85088)));
            yy = 6.15845 + (((tickAnim - 670) / 27) * (3.1505-(6.15845)));
            zz = -5.26937 + (((tickAnim - 670) / 27) * (-2.69567-(-5.26937)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 9.0148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*10 + (((tickAnim - 697) / 13) * (0-(9.0148+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*10)));
            yy = 3.1505 + (((tickAnim - 697) / 13) * (0-(3.1505)));
            zz = -2.69567 + (((tickAnim - 697) / 13) * (0-(-2.69567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (13.69-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 13.69 + (((tickAnim - 19) / 16) * (5.25-(13.69)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 59) {
            xx = 5.25 + (((tickAnim - 35) / 24) * (5.5-(5.25)));
            yy = 0 + (((tickAnim - 35) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 24) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = 5.5 + (((tickAnim - 59) / 29) * (5.25-(5.5)));
            yy = 0 + (((tickAnim - 59) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 29) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 112) {
            xx = 5.25 + (((tickAnim - 88) / 24) * (5.5-(5.25)));
            yy = 0 + (((tickAnim - 88) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 24) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 5.5 + (((tickAnim - 112) / 28) * (5.25-(5.5)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 28) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = 5.25 + (((tickAnim - 140) / 13) * (-9.97776-(5.25)));
            yy = 0 + (((tickAnim - 140) / 13) * (4.83076-(0)));
            zz = 0 + (((tickAnim - 140) / 13) * (1.75072-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = -9.97776 + (((tickAnim - 153) / 13) * (-9.97776-(-9.97776)));
            yy = 4.83076 + (((tickAnim - 153) / 13) * (4.83076-(4.83076)));
            zz = 1.75072 + (((tickAnim - 153) / 13) * (1.75072-(1.75072)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = -9.97776 + (((tickAnim - 166) / 14) * (-10.97776-(-9.97776)));
            yy = 4.83076 + (((tickAnim - 166) / 14) * (4.83076-(4.83076)));
            zz = 1.75072 + (((tickAnim - 166) / 14) * (1.75072-(1.75072)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -10.97776 + (((tickAnim - 180) / 40) * (-9.47776-(-10.97776)));
            yy = 4.83076 + (((tickAnim - 180) / 40) * (4.83076-(4.83076)));
            zz = 1.75072 + (((tickAnim - 180) / 40) * (1.75072-(1.75072)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -9.47776 + (((tickAnim - 220) / 15) * (-9.21149-(-9.47776)));
            yy = 4.83076 + (((tickAnim - 220) / 15) * (1.65372-(4.83076)));
            zz = 1.75072 + (((tickAnim - 220) / 15) * (5.06715-(1.75072)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -9.21149 + (((tickAnim - 235) / 27) * (4.28851-(-9.21149)));
            yy = 1.65372 + (((tickAnim - 235) / 27) * (1.65372-(1.65372)));
            zz = 5.06715 + (((tickAnim - 235) / 27) * (5.06715-(5.06715)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = 4.28851 + (((tickAnim - 262) / 28) * (-3.08493-(4.28851)));
            yy = 1.65372 + (((tickAnim - 262) / 28) * (0.32792-(1.65372)));
            zz = 5.06715 + (((tickAnim - 262) / 28) * (-2.06182-(5.06715)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = -3.08493 + (((tickAnim - 290) / 29) * (-3.08493-(-3.08493)));
            yy = 0.32792 + (((tickAnim - 290) / 29) * (0.32792-(0.32792)));
            zz = -2.06182 + (((tickAnim - 290) / 29) * (-2.06182-(-2.06182)));
        }
        else if (tickAnim >= 319 && tickAnim < 380) {
            xx = -3.08493 + (((tickAnim - 319) / 61) * (1.8151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-3.08493)));
            yy = 0.32792 + (((tickAnim - 319) / 61) * (0.32792-(0.32792)));
            zz = -2.06182 + (((tickAnim - 319) / 61) * (-2.06182-(-2.06182)));
        }
        else if (tickAnim >= 380 && tickAnim < 450) {
            xx = 1.8151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 380) / 70) * (-3.08493-(1.8151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0.32792 + (((tickAnim - 380) / 70) * (0.32792-(0.32792)));
            zz = -2.06182 + (((tickAnim - 380) / 70) * (-2.06182-(-2.06182)));
        }
        else if (tickAnim >= 450 && tickAnim < 548) {
            xx = -3.08493 + (((tickAnim - 450) / 98) * (1.8151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2-(-3.08493)));
            yy = 0.32792 + (((tickAnim - 450) / 98) * (0.32792-(0.32792)));
            zz = -2.06182 + (((tickAnim - 450) / 98) * (-2.06182-(-2.06182)));
        }
        else if (tickAnim >= 548 && tickAnim < 635) {
            xx = 1.8151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2 + (((tickAnim - 548) / 87) * (-3.08493-(1.8151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2)));
            yy = 0.32792 + (((tickAnim - 548) / 87) * (0.32792-(0.32792)));
            zz = -2.06182 + (((tickAnim - 548) / 87) * (-2.06182-(-2.06182)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -3.08493 + (((tickAnim - 635) / 15) * (-12.45842-(-3.08493)));
            yy = 0.32792 + (((tickAnim - 635) / 15) * (-6.25519-(0.32792)));
            zz = -2.06182 + (((tickAnim - 635) / 15) * (0.32233-(-2.06182)));
        }
        else if (tickAnim >= 650 && tickAnim < 670) {
            xx = -12.45842 + (((tickAnim - 650) / 20) * (-14.20842-(-12.45842)));
            yy = -6.25519 + (((tickAnim - 650) / 20) * (-6.25519-(-6.25519)));
            zz = 0.32233 + (((tickAnim - 650) / 20) * (0.32233-(0.32233)));
        }
        else if (tickAnim >= 670 && tickAnim < 697) {
            xx = -14.20842 + (((tickAnim - 670) / 27) * (1.36999-(-14.20842)));
            yy = -6.25519 + (((tickAnim - 670) / 27) * (-3.19999-(-6.25519)));
            zz = 0.32233 + (((tickAnim - 670) / 27) * (0.1649-(0.32233)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 1.36999 + (((tickAnim - 697) / 13) * (0-(1.36999)));
            yy = -3.19999 + (((tickAnim - 697) / 13) * (0-(-3.19999)));
            zz = 0.1649 + (((tickAnim - 697) / 13) * (0-(0.1649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (-43.87285-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (-6.84748-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (-28.04186-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 140) {
            xx = -43.87285 + (((tickAnim - 35) / 105) * (-43.87285-(-43.87285)));
            yy = -6.84748 + (((tickAnim - 35) / 105) * (-6.84748-(-6.84748)));
            zz = -28.04186 + (((tickAnim - 35) / 105) * (-28.04186-(-28.04186)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = -43.87285 + (((tickAnim - 140) / 13) * (-11.44577-(-43.87285)));
            yy = -6.84748 + (((tickAnim - 140) / 13) * (-19.26769-(-6.84748)));
            zz = -28.04186 + (((tickAnim - 140) / 13) * (-23.27011-(-28.04186)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = -11.44577 + (((tickAnim - 153) / 13) * (-11.44577-(-11.44577)));
            yy = -19.26769 + (((tickAnim - 153) / 13) * (-19.26769-(-19.26769)));
            zz = -23.27011 + (((tickAnim - 153) / 13) * (-23.27011-(-23.27011)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = -11.44577 + (((tickAnim - 166) / 14) * (-11.44577-(-11.44577)));
            yy = -19.26769 + (((tickAnim - 166) / 14) * (-19.26769-(-19.26769)));
            zz = -23.27011 + (((tickAnim - 166) / 14) * (-23.27011-(-23.27011)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -11.44577 + (((tickAnim - 180) / 40) * (-11.44577-(-11.44577)));
            yy = -19.26769 + (((tickAnim - 180) / 40) * (-19.26769-(-19.26769)));
            zz = -23.27011 + (((tickAnim - 180) / 40) * (-23.27011-(-23.27011)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -11.44577 + (((tickAnim - 220) / 15) * (-11.70587-(-11.44577)));
            yy = -19.26769 + (((tickAnim - 220) / 15) * (-13.69376-(-19.26769)));
            zz = -23.27011 + (((tickAnim - 220) / 15) * (-24.79528-(-23.27011)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -11.70587 + (((tickAnim - 235) / 27) * (-6.25779-(-11.70587)));
            yy = -13.69376 + (((tickAnim - 235) / 27) * (-2.72817-(-13.69376)));
            zz = -24.79528 + (((tickAnim - 235) / 27) * (-25.7168-(-24.79528)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = -6.25779 + (((tickAnim - 262) / 28) * (-0.17664-(-6.25779)));
            yy = -2.72817 + (((tickAnim - 262) / 28) * (0.07919-(-2.72817)));
            zz = -25.7168 + (((tickAnim - 262) / 28) * (-10.17159-(-25.7168)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = -0.17664 + (((tickAnim - 290) / 29) * (-0.17664-(-0.17664)));
            yy = 0.07919 + (((tickAnim - 290) / 29) * (0.07919-(0.07919)));
            zz = -10.17159 + (((tickAnim - 290) / 29) * (-10.17159-(-10.17159)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -0.17664 + (((tickAnim - 319) / 316) * (-0.17664-(-0.17664)));
            yy = 0.07919 + (((tickAnim - 319) / 316) * (0.07919-(0.07919)));
            zz = -10.17159 + (((tickAnim - 319) / 316) * (-10.17159-(-10.17159)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -0.17664 + (((tickAnim - 635) / 15) * (0-(-0.17664)));
            yy = 0.07919 + (((tickAnim - 635) / 15) * (0-(0.07919)));
            zz = -10.17159 + (((tickAnim - 635) / 15) * (0-(-10.17159)));
        }
        else if (tickAnim >= 650 && tickAnim < 697) {
            xx = 0 + (((tickAnim - 650) / 47) * (-20.22477-(0)));
            yy = 0 + (((tickAnim - 650) / 47) * (-12.708-(0)));
            zz = 0 + (((tickAnim - 650) / 47) * (-31.28716-(0)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = -20.22477 + (((tickAnim - 697) / 13) * (0-(-20.22477)));
            yy = -12.708 + (((tickAnim - 697) / 13) * (0-(-12.708)));
            zz = -31.28716 + (((tickAnim - 697) / 13) * (0-(-31.28716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-38.52182-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-43.83061-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-10.72376-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 140) {
            xx = -38.52182 + (((tickAnim - 35) / 105) * (-38.52182-(-38.52182)));
            yy = -43.83061 + (((tickAnim - 35) / 105) * (-43.83061-(-43.83061)));
            zz = -10.72376 + (((tickAnim - 35) / 105) * (-10.72376-(-10.72376)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = -38.52182 + (((tickAnim - 140) / 13) * (-11.02182-(-38.52182)));
            yy = -43.83061 + (((tickAnim - 140) / 13) * (-43.83061-(-43.83061)));
            zz = -10.72376 + (((tickAnim - 140) / 13) * (-10.72376-(-10.72376)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = -11.02182 + (((tickAnim - 153) / 13) * (-11.02182-(-11.02182)));
            yy = -43.83061 + (((tickAnim - 153) / 13) * (-43.83061-(-43.83061)));
            zz = -10.72376 + (((tickAnim - 153) / 13) * (-10.72376-(-10.72376)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = -11.02182 + (((tickAnim - 166) / 14) * (-11.02182-(-11.02182)));
            yy = -43.83061 + (((tickAnim - 166) / 14) * (-43.83061-(-43.83061)));
            zz = -10.72376 + (((tickAnim - 166) / 14) * (-10.72376-(-10.72376)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -11.02182 + (((tickAnim - 180) / 40) * (-11.02182-(-11.02182)));
            yy = -43.83061 + (((tickAnim - 180) / 40) * (-43.83061-(-43.83061)));
            zz = -10.72376 + (((tickAnim - 180) / 40) * (-10.72376-(-10.72376)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -11.02182 + (((tickAnim - 220) / 15) * (-12.86012-(-11.02182)));
            yy = -43.83061 + (((tickAnim - 220) / 15) * (-9.91984-(-43.83061)));
            zz = -10.72376 + (((tickAnim - 220) / 15) * (-6.05441-(-10.72376)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = -12.86012 + (((tickAnim - 235) / 27) * (-87.02564-(-12.86012)));
            yy = -9.91984 + (((tickAnim - 235) / 27) * (-13.48024-(-9.91984)));
            zz = -6.05441 + (((tickAnim - 235) / 27) * (10.6656-(-6.05441)));
        }
        else if (tickAnim >= 262 && tickAnim < 319) {
            xx = -87.02564 + (((tickAnim - 262) / 57) * (-87.77564-(-87.02564)));
            yy = -13.48024 + (((tickAnim - 262) / 57) * (-13.48024-(-13.48024)));
            zz = 10.6656 + (((tickAnim - 262) / 57) * (10.6656-(10.6656)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -87.77564 + (((tickAnim - 319) / 316) * (-87.77564-(-87.77564)));
            yy = -13.48024 + (((tickAnim - 319) / 316) * (-13.48024-(-13.48024)));
            zz = 10.6656 + (((tickAnim - 319) / 316) * (10.6656-(10.6656)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -87.77564 + (((tickAnim - 635) / 15) * (-27.02564-(-87.77564)));
            yy = -13.48024 + (((tickAnim - 635) / 15) * (-13.48024-(-13.48024)));
            zz = 10.6656 + (((tickAnim - 635) / 15) * (10.6656-(10.6656)));
        }
        else if (tickAnim >= 650 && tickAnim < 710) {
            xx = -27.02564 + (((tickAnim - 650) / 60) * (0-(-27.02564)));
            yy = -13.48024 + (((tickAnim - 650) / 60) * (0-(-13.48024)));
            zz = 10.6656 + (((tickAnim - 650) / 60) * (0-(10.6656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 0) / 262) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 262) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 262) * (-1.075-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 262) / 388) * (0-(0)));
            yy = -0.325 + (((tickAnim - 262) / 388) * (0-(-0.325)));
            zz = -1.075 + (((tickAnim - 262) / 388) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (-45.36442-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (3.72582-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (30.34785-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 140) {
            xx = -45.36442 + (((tickAnim - 35) / 105) * (-45.36442-(-45.36442)));
            yy = 3.72582 + (((tickAnim - 35) / 105) * (3.72582-(3.72582)));
            zz = 30.34785 + (((tickAnim - 35) / 105) * (30.34785-(30.34785)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = -45.36442 + (((tickAnim - 140) / 13) * (-42.77992-(-45.36442)));
            yy = 3.72582 + (((tickAnim - 140) / 13) * (8.90588-(3.72582)));
            zz = 30.34785 + (((tickAnim - 140) / 13) * (23.12844-(30.34785)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = -42.77992 + (((tickAnim - 153) / 13) * (-42.77992-(-42.77992)));
            yy = 8.90588 + (((tickAnim - 153) / 13) * (8.90588-(8.90588)));
            zz = 23.12844 + (((tickAnim - 153) / 13) * (23.12844-(23.12844)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = -42.77992 + (((tickAnim - 166) / 14) * (-42.77992-(-42.77992)));
            yy = 8.90588 + (((tickAnim - 166) / 14) * (8.90588-(8.90588)));
            zz = 23.12844 + (((tickAnim - 166) / 14) * (23.12844-(23.12844)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -42.77992 + (((tickAnim - 180) / 40) * (-32.28841-(-42.77992)));
            yy = 8.90588 + (((tickAnim - 180) / 40) * (18.78092-(8.90588)));
            zz = 23.12844 + (((tickAnim - 180) / 40) * (22.36406-(23.12844)));
        }
        else if (tickAnim >= 220 && tickAnim < 262) {
            xx = -32.28841 + (((tickAnim - 220) / 42) * (-53.92117-(-32.28841)));
            yy = 18.78092 + (((tickAnim - 220) / 42) * (9.68611-(18.78092)));
            zz = 22.36406 + (((tickAnim - 220) / 42) * (49.91216-(22.36406)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = -53.92117 + (((tickAnim - 262) / 28) * (-22.26889-(-53.92117)));
            yy = 9.68611 + (((tickAnim - 262) / 28) * (-11.88704-(9.68611)));
            zz = 49.91216 + (((tickAnim - 262) / 28) * (19.62975-(49.91216)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = -22.26889 + (((tickAnim - 290) / 29) * (-22.26889-(-22.26889)));
            yy = -11.88704 + (((tickAnim - 290) / 29) * (-11.88704-(-11.88704)));
            zz = 19.62975 + (((tickAnim - 290) / 29) * (19.62975-(19.62975)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -22.26889 + (((tickAnim - 319) / 316) * (-22.26889-(-22.26889)));
            yy = -11.88704 + (((tickAnim - 319) / 316) * (-11.88704-(-11.88704)));
            zz = 19.62975 + (((tickAnim - 319) / 316) * (19.62975-(19.62975)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -22.26889 + (((tickAnim - 635) / 15) * (0-(-22.26889)));
            yy = -11.88704 + (((tickAnim - 635) / 15) * (0-(-11.88704)));
            zz = 19.62975 + (((tickAnim - 635) / 15) * (0-(19.62975)));
        }
        else if (tickAnim >= 650 && tickAnim < 697) {
            xx = 0 + (((tickAnim - 650) / 47) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 650) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 47) * (0-(0)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = -15.75 + (((tickAnim - 697) / 13) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 697) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 697) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-51.65153-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (40.27221-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-3.83365-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 140) {
            xx = -51.65153 + (((tickAnim - 35) / 105) * (-45.15153-(-51.65153)));
            yy = 40.27221 + (((tickAnim - 35) / 105) * (40.27221-(40.27221)));
            zz = -3.83365 + (((tickAnim - 35) / 105) * (-3.83365-(-3.83365)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = -45.15153 + (((tickAnim - 140) / 13) * (0.95341-(-45.15153)));
            yy = 40.27221 + (((tickAnim - 140) / 13) * (17.33034-(40.27221)));
            zz = -3.83365 + (((tickAnim - 140) / 13) * (-8.19555-(-3.83365)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = 0.95341 + (((tickAnim - 153) / 13) * (0.95341-(0.95341)));
            yy = 17.33034 + (((tickAnim - 153) / 13) * (17.33034-(17.33034)));
            zz = -8.19555 + (((tickAnim - 153) / 13) * (-8.19555-(-8.19555)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = 0.95341 + (((tickAnim - 166) / 14) * (0.95341-(0.95341)));
            yy = 17.33034 + (((tickAnim - 166) / 14) * (17.33034-(17.33034)));
            zz = -8.19555 + (((tickAnim - 166) / 14) * (-8.19555-(-8.19555)));
        }
        else if (tickAnim >= 180 && tickAnim < 262) {
            xx = 0.95341 + (((tickAnim - 180) / 82) * (-21.37337-(0.95341)));
            yy = 17.33034 + (((tickAnim - 180) / 82) * (10.54024-(17.33034)));
            zz = -8.19555 + (((tickAnim - 180) / 82) * (-6.44139-(-8.19555)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = -21.37337 + (((tickAnim - 262) / 28) * (-85.76305-(-21.37337)));
            yy = 10.54024 + (((tickAnim - 262) / 28) * (15.96292-(10.54024)));
            zz = -6.44139 + (((tickAnim - 262) / 28) * (-23.27541-(-6.44139)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = -85.76305 + (((tickAnim - 290) / 29) * (-85.76305-(-85.76305)));
            yy = 15.96292 + (((tickAnim - 290) / 29) * (15.96292-(15.96292)));
            zz = -23.27541 + (((tickAnim - 290) / 29) * (-23.27541-(-23.27541)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -85.76305 + (((tickAnim - 319) / 316) * (-85.76305-(-85.76305)));
            yy = 15.96292 + (((tickAnim - 319) / 316) * (15.96292-(15.96292)));
            zz = -23.27541 + (((tickAnim - 319) / 316) * (-23.27541-(-23.27541)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -85.76305 + (((tickAnim - 635) / 15) * (-35.51305-(-85.76305)));
            yy = 15.96292 + (((tickAnim - 635) / 15) * (15.96292-(15.96292)));
            zz = -23.27541 + (((tickAnim - 635) / 15) * (-23.27541-(-23.27541)));
        }
        else if (tickAnim >= 650 && tickAnim < 710) {
            xx = -35.51305 + (((tickAnim - 650) / 60) * (0-(-35.51305)));
            yy = 15.96292 + (((tickAnim - 650) / 60) * (0-(15.96292)));
            zz = -23.27541 + (((tickAnim - 650) / 60) * (0-(-23.27541)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 0) / 262) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 262) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 262) * (-0.9-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 262) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 28) * (-0.3-(0)));
            zz = -0.9 + (((tickAnim - 262) / 28) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 290) / 29) * (0-(0)));
            yy = -0.3 + (((tickAnim - 290) / 29) * (-0.3-(-0.3)));
            zz = -0.9 + (((tickAnim - 290) / 29) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = -0.3 + (((tickAnim - 319) / 316) * (-0.3-(-0.3)));
            zz = -0.9 + (((tickAnim - 319) / 316) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 635) / 15) * (0-(-0.3)));
            zz = -0.9 + (((tickAnim - 635) / 15) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (16.95-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 16.95 + (((tickAnim - 19) / 16) * (9.75-(16.95)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 59) {
            xx = 9.75 + (((tickAnim - 35) / 24) * (13.25-(9.75)));
            yy = 0 + (((tickAnim - 35) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 24) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = 13.25 + (((tickAnim - 59) / 29) * (9.75-(13.25)));
            yy = 0 + (((tickAnim - 59) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 29) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 112) {
            xx = 9.75 + (((tickAnim - 88) / 24) * (13.25-(9.75)));
            yy = 0 + (((tickAnim - 88) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 24) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 13.25 + (((tickAnim - 112) / 28) * (9.75-(13.25)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 28) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = 9.75 + (((tickAnim - 140) / 13) * (7.96951-(9.75)));
            yy = 0 + (((tickAnim - 140) / 13) * (8.49014-(0)));
            zz = 0 + (((tickAnim - 140) / 13) * (-0.41083-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = 7.96951 + (((tickAnim - 153) / 13) * (10.96951-(7.96951)));
            yy = 8.49014 + (((tickAnim - 153) / 13) * (8.49014-(8.49014)));
            zz = -0.41083 + (((tickAnim - 153) / 13) * (-0.41083-(-0.41083)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = 10.96951 + (((tickAnim - 166) / 14) * (10.96951-(10.96951)));
            yy = 8.49014 + (((tickAnim - 166) / 14) * (8.49014-(8.49014)));
            zz = -0.41083 + (((tickAnim - 166) / 14) * (-0.41083-(-0.41083)));
        }
        else if (tickAnim >= 180 && tickAnim < 194) {
            xx = 10.96951 + (((tickAnim - 180) / 14) * (10.19079-(10.96951)));
            yy = 8.49014 + (((tickAnim - 180) / 14) * (-7.81295-(8.49014)));
            zz = -0.41083 + (((tickAnim - 180) / 14) * (-6.30162-(-0.41083)));
        }
        else if (tickAnim >= 194 && tickAnim < 220) {
            xx = 10.19079 + (((tickAnim - 194) / 26) * (10.19079-(10.19079)));
            yy = -7.81295 + (((tickAnim - 194) / 26) * (-7.81295-(-7.81295)));
            zz = -6.30162 + (((tickAnim - 194) / 26) * (-6.30162-(-6.30162)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = 10.19079 + (((tickAnim - 220) / 15) * (12.13488-(10.19079)));
            yy = -7.81295 + (((tickAnim - 220) / 15) * (-11.03707-(-7.81295)));
            zz = -6.30162 + (((tickAnim - 220) / 15) * (-0.31426-(-6.30162)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 12.13488 + (((tickAnim - 235) / 27) * (31.02185-(12.13488)));
            yy = -11.03707 + (((tickAnim - 235) / 27) * (7.14505-(-11.03707)));
            zz = -0.31426 + (((tickAnim - 235) / 27) * (-7.30947-(-0.31426)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = 31.02185 + (((tickAnim - 262) / 28) * (40.23373-(31.02185)));
            yy = 7.14505 + (((tickAnim - 262) / 28) * (3.63537-(7.14505)));
            zz = -7.30947 + (((tickAnim - 262) / 28) * (2.89836-(-7.30947)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 40.23373 + (((tickAnim - 290) / 29) * (40.23373-(40.23373)));
            yy = 3.63537 + (((tickAnim - 290) / 29) * (3.63537-(3.63537)));
            zz = 2.89836 + (((tickAnim - 290) / 29) * (2.89836-(2.89836)));
        }
        else if (tickAnim >= 319 && tickAnim < 380) {
            xx = 40.23373 + (((tickAnim - 319) / 61) * (34.48373-(40.23373)));
            yy = 3.63537 + (((tickAnim - 319) / 61) * (3.63537-(3.63537)));
            zz = 2.89836 + (((tickAnim - 319) / 61) * (2.89836-(2.89836)));
        }
        else if (tickAnim >= 380 && tickAnim < 450) {
            xx = 34.48373 + (((tickAnim - 380) / 70) * (40.23373-(34.48373)));
            yy = 3.63537 + (((tickAnim - 380) / 70) * (3.63537-(3.63537)));
            zz = 2.89836 + (((tickAnim - 380) / 70) * (2.89836-(2.89836)));
        }
        else if (tickAnim >= 450 && tickAnim < 548) {
            xx = 40.23373 + (((tickAnim - 450) / 98) * (29.48373-(40.23373)));
            yy = 3.63537 + (((tickAnim - 450) / 98) * (3.63537-(3.63537)));
            zz = 2.89836 + (((tickAnim - 450) / 98) * (2.89836-(2.89836)));
        }
        else if (tickAnim >= 548 && tickAnim < 635) {
            xx = 29.48373 + (((tickAnim - 548) / 87) * (40.23373-(29.48373)));
            yy = 3.63537 + (((tickAnim - 548) / 87) * (3.63537-(3.63537)));
            zz = 2.89836 + (((tickAnim - 548) / 87) * (2.89836-(2.89836)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 40.23373 + (((tickAnim - 635) / 15) * (13.73373-(40.23373)));
            yy = 3.63537 + (((tickAnim - 635) / 15) * (3.63537-(3.63537)));
            zz = 2.89836 + (((tickAnim - 635) / 15) * (2.89836-(2.89836)));
        }
        else if (tickAnim >= 650 && tickAnim < 697) {
            xx = 13.73373 + (((tickAnim - 650) / 47) * (3.99867-(13.73373)));
            yy = 3.63537 + (((tickAnim - 650) / 47) * (0.55869-(3.63537)));
            zz = 2.89836 + (((tickAnim - 650) / 47) * (-4.78678-(2.89836)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 3.99867 + (((tickAnim - 697) / 13) * (0-(3.99867)));
            yy = 0.55869 + (((tickAnim - 697) / 13) * (0-(0.55869)));
            zz = -4.78678 + (((tickAnim - 697) / 13) * (0-(-4.78678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 290) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 290) * (-1.95-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 290) / 29) * (0-(0)));
            yy = -0.5 + (((tickAnim - 290) / 29) * (-0.5-(-0.5)));
            zz = -1.95 + (((tickAnim - 290) / 29) * (-1.95-(-1.95)));
        }
        else if (tickAnim >= 319 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 319) / 131) * (0-(0)));
            yy = -0.5 + (((tickAnim - 319) / 131) * (-0.5-(-0.5)));
            zz = -1.95 + (((tickAnim - 319) / 131) * (-1.95-(-1.95)));
        }
        else if (tickAnim >= 450 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 450) / 185) * (0-(0)));
            yy = -0.5 + (((tickAnim - 450) / 185) * (-0.5-(-0.5)));
            zz = -1.95 + (((tickAnim - 450) / 185) * (-1.95-(-1.95)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = -0.5 + (((tickAnim - 635) / 15) * (0-(-0.5)));
            zz = -1.95 + (((tickAnim - 635) / 15) * (0-(-1.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5.69269-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-2.96677-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-1.78479-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -5.69269 + (((tickAnim - 19) / 16) * (-1.68514-(-5.69269)));
            yy = -2.96677 + (((tickAnim - 19) / 16) * (-5.30334-(-2.96677)));
            zz = -1.78479 + (((tickAnim - 19) / 16) * (-3.19045-(-1.78479)));
        }
        else if (tickAnim >= 35 && tickAnim < 59) {
            xx = -1.68514 + (((tickAnim - 35) / 24) * (-4.16182-(-1.68514)));
            yy = -5.30334 + (((tickAnim - 35) / 24) * (-5.4627-(-5.30334)));
            zz = -3.19045 + (((tickAnim - 35) / 24) * (-3.28632-(-3.19045)));
        }
        else if (tickAnim >= 59 && tickAnim < 88) {
            xx = -4.16182 + (((tickAnim - 59) / 29) * (-1.68514-(-4.16182)));
            yy = -5.4627 + (((tickAnim - 59) / 29) * (-5.30334-(-5.4627)));
            zz = -3.28632 + (((tickAnim - 59) / 29) * (-3.19045-(-3.28632)));
        }
        else if (tickAnim >= 88 && tickAnim < 112) {
            xx = -1.68514 + (((tickAnim - 88) / 24) * (-4.16182-(-1.68514)));
            yy = -5.30334 + (((tickAnim - 88) / 24) * (-5.4627-(-5.30334)));
            zz = -3.19045 + (((tickAnim - 88) / 24) * (-3.28632-(-3.19045)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = -4.16182 + (((tickAnim - 112) / 28) * (-1.68514-(-4.16182)));
            yy = -5.4627 + (((tickAnim - 112) / 28) * (-5.30334-(-5.4627)));
            zz = -3.28632 + (((tickAnim - 112) / 28) * (-3.19045-(-3.28632)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = -1.68514 + (((tickAnim - 140) / 13) * (11.28947-(-1.68514)));
            yy = -5.30334 + (((tickAnim - 140) / 13) * (17.37395-(-5.30334)));
            zz = -3.19045 + (((tickAnim - 140) / 13) * (7.7776-(-3.19045)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = 11.28947 + (((tickAnim - 153) / 13) * (5.53947-(11.28947)));
            yy = 17.37395 + (((tickAnim - 153) / 13) * (17.37395-(17.37395)));
            zz = 7.7776 + (((tickAnim - 153) / 13) * (7.7776-(7.7776)));
        }
        else if (tickAnim >= 166 && tickAnim < 173) {
            xx = 5.53947 + (((tickAnim - 166) / 7) * (4.96117-(5.53947)));
            yy = 17.37395 + (((tickAnim - 166) / 7) * (16.56215-(17.37395)));
            zz = 7.7776 + (((tickAnim - 166) / 7) * (8.61513-(7.7776)));
        }
        else if (tickAnim >= 173 && tickAnim < 180) {
            xx = 4.96117 + (((tickAnim - 173) / 7) * (5.53947-(4.96117)));
            yy = 16.56215 + (((tickAnim - 173) / 7) * (17.37395-(16.56215)));
            zz = 8.61513 + (((tickAnim - 173) / 7) * (7.7776-(8.61513)));
        }
        else if (tickAnim >= 180 && tickAnim < 194) {
            xx = 5.53947 + (((tickAnim - 180) / 14) * (-3.78492-(5.53947)));
            yy = 17.37395 + (((tickAnim - 180) / 14) * (-17.17669-(17.37395)));
            zz = 7.7776 + (((tickAnim - 180) / 14) * (-4.07049-(7.7776)));
        }
        else if (tickAnim >= 194 && tickAnim < 201) {
            xx = -3.78492 + (((tickAnim - 194) / 7) * (-4.63418-(-3.78492)));
            yy = -17.17669 + (((tickAnim - 194) / 7) * (-18.38778-(-17.17669)));
            zz = -4.07049 + (((tickAnim - 194) / 7) * (-3.74549-(-4.07049)));
        }
        else if (tickAnim >= 201 && tickAnim < 210) {
            xx = -4.63418 + (((tickAnim - 201) / 9) * (-5.13418-(-4.63418)));
            yy = -18.38778 + (((tickAnim - 201) / 9) * (-18.38778-(-18.38778)));
            zz = -3.74549 + (((tickAnim - 201) / 9) * (-3.74549-(-3.74549)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = -5.13418 + (((tickAnim - 210) / 10) * (-3.38418-(-5.13418)));
            yy = -18.38778 + (((tickAnim - 210) / 10) * (-18.38778-(-18.38778)));
            zz = -3.74549 + (((tickAnim - 210) / 10) * (-3.74549-(-3.74549)));
        }
        else if (tickAnim >= 220 && tickAnim < 235) {
            xx = -3.38418 + (((tickAnim - 220) / 15) * (13.32449-(-3.38418)));
            yy = -18.38778 + (((tickAnim - 220) / 15) * (-12.50864-(-18.38778)));
            zz = -3.74549 + (((tickAnim - 220) / 15) * (-0.07343-(-3.74549)));
        }
        else if (tickAnim >= 235 && tickAnim < 262) {
            xx = 13.32449 + (((tickAnim - 235) / 27) * (13.54348-(13.32449)));
            yy = -12.50864 + (((tickAnim - 235) / 27) * (9.21585-(-12.50864)));
            zz = -0.07343 + (((tickAnim - 235) / 27) * (0.98653-(-0.07343)));
        }
        else if (tickAnim >= 262 && tickAnim < 274) {
            xx = 13.54348 + (((tickAnim - 262) / 12) * (10.55675-(13.54348)));
            yy = 9.21585 + (((tickAnim - 262) / 12) * (10.34965-(9.21585)));
            zz = 0.98653 + (((tickAnim - 262) / 12) * (-3.16981-(0.98653)));
        }
        else if (tickAnim >= 274 && tickAnim < 290) {
            xx = 10.55675 + (((tickAnim - 274) / 16) * (17.40636-(10.55675)));
            yy = 10.34965 + (((tickAnim - 274) / 16) * (8.64307-(10.34965)));
            zz = -3.16981 + (((tickAnim - 274) / 16) * (-6.32963-(-3.16981)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 17.40636 + (((tickAnim - 290) / 29) * (17.40636-(17.40636)));
            yy = 8.64307 + (((tickAnim - 290) / 29) * (8.64307-(8.64307)));
            zz = -6.32963 + (((tickAnim - 290) / 29) * (-6.32963-(-6.32963)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 17.40636 + (((tickAnim - 319) / 316) * (17.40636-(17.40636)));
            yy = 8.64307 + (((tickAnim - 319) / 316) * (8.64307-(8.64307)));
            zz = -6.32963 + (((tickAnim - 319) / 316) * (-6.32963-(-6.32963)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 17.40636 + (((tickAnim - 635) / 15) * (0-(17.40636)));
            yy = 8.64307 + (((tickAnim - 635) / 15) * (0-(8.64307)));
            zz = -6.32963 + (((tickAnim - 635) / 15) * (0-(-6.32963)));
        }
        else if (tickAnim >= 650 && tickAnim < 697) {
            xx = 0 + (((tickAnim - 650) / 47) * (-7.8814-(0)));
            yy = 0 + (((tickAnim - 650) / 47) * (-0.43766-(0)));
            zz = 0 + (((tickAnim - 650) / 47) * (0.32051-(0)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = -7.8814 + (((tickAnim - 697) / 13) * (0-(-7.8814)));
            yy = -0.43766 + (((tickAnim - 697) / 13) * (0-(-0.43766)));
            zz = 0.32051 + (((tickAnim - 697) / 13) * (0-(0.32051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 290) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 290) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 290) / 29) * (0-(0)));
            yy = -0.6 + (((tickAnim - 290) / 29) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 290) / 29) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = -0.6 + (((tickAnim - 319) / 316) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 319) / 316) * (0-(0)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = -0.6 + (((tickAnim - 635) / 15) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 635) / 15) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 697) {
            xx = 0 + (((tickAnim - 650) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 650) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 47) * (0.5-(0)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 697) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 697) / 13) * (0-(0)));
            zz = 0.5 + (((tickAnim - 697) / 13) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5.25503-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-5.87387-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -5.25503 + (((tickAnim - 19) / 16) * (-8.5-(-5.25503)));
            yy = -5.87387 + (((tickAnim - 19) / 16) * (-10.5-(-5.87387)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 140) {
            xx = -8.5 + (((tickAnim - 35) / 105) * (-8.5-(-8.5)));
            yy = -10.5 + (((tickAnim - 35) / 105) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 35) / 105) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = -8.5 + (((tickAnim - 140) / 13) * (-0.61186-(-8.5)));
            yy = -10.5 + (((tickAnim - 140) / 13) * (17.49956-(-10.5)));
            zz = 0 + (((tickAnim - 140) / 13) * (14.04644-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = -0.61186 + (((tickAnim - 153) / 13) * (2.13814-(-0.61186)));
            yy = 17.49956 + (((tickAnim - 153) / 13) * (17.49956-(17.49956)));
            zz = 14.04644 + (((tickAnim - 153) / 13) * (14.04644-(14.04644)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = 2.13814 + (((tickAnim - 166) / 14) * (2.13814-(2.13814)));
            yy = 17.49956 + (((tickAnim - 166) / 14) * (17.49956-(17.49956)));
            zz = 14.04644 + (((tickAnim - 166) / 14) * (14.04644-(14.04644)));
        }
        else if (tickAnim >= 180 && tickAnim < 194) {
            xx = 2.13814 + (((tickAnim - 180) / 14) * (6.21725-(2.13814)));
            yy = 17.49956 + (((tickAnim - 180) / 14) * (-12.96018-(17.49956)));
            zz = 14.04644 + (((tickAnim - 180) / 14) * (-8.11021-(14.04644)));
        }
        else if (tickAnim >= 194 && tickAnim < 201) {
            xx = 6.21725 + (((tickAnim - 194) / 7) * (6.71725-(6.21725)));
            yy = -12.96018 + (((tickAnim - 194) / 7) * (-12.96018-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 194) / 7) * (-8.11021-(-8.11021)));
        }
        else if (tickAnim >= 201 && tickAnim < 203) {
            xx = 6.71725 + (((tickAnim - 201) / 2) * (2.46725-(6.71725)));
            yy = -12.96018 + (((tickAnim - 201) / 2) * (-12.96018-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 201) / 2) * (-8.11021-(-8.11021)));
        }
        else if (tickAnim >= 203 && tickAnim < 206) {
            xx = 2.46725 + (((tickAnim - 203) / 3) * (6.71725-(2.46725)));
            yy = -12.96018 + (((tickAnim - 203) / 3) * (-12.96018-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 203) / 3) * (-8.11021-(-8.11021)));
        }
        else if (tickAnim >= 206 && tickAnim < 208) {
            xx = 6.71725 + (((tickAnim - 206) / 2) * (2.46725-(6.71725)));
            yy = -12.96018 + (((tickAnim - 206) / 2) * (-12.96018-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 206) / 2) * (-8.11021-(-8.11021)));
        }
        else if (tickAnim >= 208 && tickAnim < 210) {
            xx = 2.46725 + (((tickAnim - 208) / 2) * (0.46725-(2.46725)));
            yy = -12.96018 + (((tickAnim - 208) / 2) * (-12.96018-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 208) / 2) * (-8.11021-(-8.11021)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 0.46725 + (((tickAnim - 210) / 10) * (9.21725-(0.46725)));
            yy = -12.96018 + (((tickAnim - 210) / 10) * (-12.96018-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 210) / 10) * (-8.11021-(-8.11021)));
        }
        else if (tickAnim >= 220 && tickAnim < 262) {
            xx = 9.21725 + (((tickAnim - 220) / 42) * (-21.6238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5-(9.21725)));
            yy = -12.96018 + (((tickAnim - 220) / 42) * (1.24545-(-12.96018)));
            zz = -8.11021 + (((tickAnim - 220) / 42) * (5.35445-(-8.11021)));
        }
        else if (tickAnim >= 262 && tickAnim < 290) {
            xx = -21.6238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5 + (((tickAnim - 262) / 28) * (-52.15246-(-21.6238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5)));
            yy = 1.24545 + (((tickAnim - 262) / 28) * (3.1486-(1.24545)));
            zz = 5.35445 + (((tickAnim - 262) / 28) * (-0.6034-(5.35445)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = -52.15246 + (((tickAnim - 290) / 29) * (-52.15246-(-52.15246)));
            yy = 3.1486 + (((tickAnim - 290) / 29) * (3.1486-(3.1486)));
            zz = -0.6034 + (((tickAnim - 290) / 29) * (-0.6034-(-0.6034)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = -52.15246 + (((tickAnim - 319) / 316) * (-52.15246-(-52.15246)));
            yy = 3.1486 + (((tickAnim - 319) / 316) * (3.1486-(3.1486)));
            zz = -0.6034 + (((tickAnim - 319) / 316) * (-0.6034-(-0.6034)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = -52.15246 + (((tickAnim - 635) / 15) * (6.67254-(-52.15246)));
            yy = 3.1486 + (((tickAnim - 635) / 15) * (0.07399-(3.1486)));
            zz = -0.6034 + (((tickAnim - 635) / 15) * (-0.01418-(-0.6034)));
        }
        else if (tickAnim >= 650 && tickAnim < 652) {
            xx = 6.67254 + (((tickAnim - 650) / 2) * (4-(6.67254)));
            yy = 0.07399 + (((tickAnim - 650) / 2) * (0-(0.07399)));
            zz = -0.01418 + (((tickAnim - 650) / 2) * (0-(-0.01418)));
        }
        else if (tickAnim >= 652 && tickAnim < 653) {
            xx = 4 + (((tickAnim - 652) / 1) * (6.67254-(4)));
            yy = 0 + (((tickAnim - 652) / 1) * (0.07399-(0)));
            zz = 0 + (((tickAnim - 652) / 1) * (-0.01418-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 655) {
            xx = 6.67254 + (((tickAnim - 653) / 2) * (2-(6.67254)));
            yy = 0.07399 + (((tickAnim - 653) / 2) * (0-(0.07399)));
            zz = -0.01418 + (((tickAnim - 653) / 2) * (0-(-0.01418)));
        }
        else if (tickAnim >= 655 && tickAnim < 657) {
            xx = 2 + (((tickAnim - 655) / 2) * (6.67254-(2)));
            yy = 0 + (((tickAnim - 655) / 2) * (0.07399-(0)));
            zz = 0 + (((tickAnim - 655) / 2) * (-0.01418-(0)));
        }
        else if (tickAnim >= 657 && tickAnim < 670) {
            xx = 6.67254 + (((tickAnim - 657) / 13) * (19.90582-(6.67254)));
            yy = 0.07399 + (((tickAnim - 657) / 13) * (0.06127-(0.07399)));
            zz = -0.01418 + (((tickAnim - 657) / 13) * (-0.01174-(-0.01418)));
        }
        else if (tickAnim >= 670 && tickAnim < 697) {
            xx = 19.90582 + (((tickAnim - 670) / 27) * (-3.87761-(19.90582)));
            yy = 0.06127 + (((tickAnim - 670) / 27) * (0.03584-(0.06127)));
            zz = -0.01174 + (((tickAnim - 670) / 27) * (-0.00687-(-0.01174)));
        }
        else if (tickAnim >= 697 && tickAnim < 710) {
            xx = -3.87761 + (((tickAnim - 697) / 13) * (0-(-3.87761)));
            yy = 0.03584 + (((tickAnim - 697) / 13) * (0-(0.03584)));
            zz = -0.00687 + (((tickAnim - 697) / 13) * (0-(-0.00687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 0) / 194) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 194) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 194) * (0.24-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 194) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 194) / 26) * (0-(0)));
            zz = 0.24 + (((tickAnim - 194) / 26) * (0.24-(0.24)));
        }
        else if (tickAnim >= 220 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 220) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 70) * (0-(0)));
            zz = 0.24 + (((tickAnim - 220) / 70) * (1.1-(0.24)));
        }
        else if (tickAnim >= 290 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 290) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 29) * (0-(0)));
            zz = 1.1 + (((tickAnim - 290) / 29) * (1.1-(1.1)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = 1.1 + (((tickAnim - 319) / 316) * (1.1-(1.1)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 635) / 15) * (0-(0)));
            zz = 1.1 + (((tickAnim - 635) / 15) * (0-(1.1)));
        }
        else if (tickAnim >= 650 && tickAnim < 710) {
            xx = 0 + (((tickAnim - 650) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 650) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 57 && tickAnim < 61) {
            xx = 1 + (((tickAnim - 57) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 57) / 4) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 57) / 4) * (1-(1)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = 1 + (((tickAnim - 61) / 3) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 61) / 3) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 61) / 3) * (1-(1)));
        }
        else if (tickAnim >= 64 && tickAnim < 145) {
            xx = 1 + (((tickAnim - 64) / 81) * (1-(1)));
            yy = 1 + (((tickAnim - 64) / 81) * (1-(1)));
            zz = 1 + (((tickAnim - 64) / 81) * (1-(1)));
        }
        else if (tickAnim >= 145 && tickAnim < 148) {
            xx = 1 + (((tickAnim - 145) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 145) / 3) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 145) / 3) * (1-(1)));
        }
        else if (tickAnim >= 148 && tickAnim < 150) {
            xx = 1 + (((tickAnim - 148) / 2) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 148) / 2) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 148) / 2) * (1-(1)));
        }
        else if (tickAnim >= 150 && tickAnim < 189) {
            xx = 1 + (((tickAnim - 150) / 39) * (1-(1)));
            yy = 1 + (((tickAnim - 150) / 39) * (1-(1)));
            zz = 1 + (((tickAnim - 150) / 39) * (1-(1)));
        }
        else if (tickAnim >= 189 && tickAnim < 192) {
            xx = 1 + (((tickAnim - 189) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 189) / 3) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 189) / 3) * (1-(1)));
        }
        else if (tickAnim >= 192 && tickAnim < 194) {
            xx = 1 + (((tickAnim - 192) / 2) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 192) / 2) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 192) / 2) * (1-(1)));
        }
        else if (tickAnim >= 194 && tickAnim < 290) {
            xx = 1 + (((tickAnim - 194) / 96) * (1-(1)));
            yy = 1 + (((tickAnim - 194) / 96) * (1-(1)));
            zz = 1 + (((tickAnim - 194) / 96) * (1-(1)));
        }
        else if (tickAnim >= 290 && tickAnim < 298) {
            xx = 1 + (((tickAnim - 290) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 290) / 8) * (-0.04-(1)));
            zz = 1 + (((tickAnim - 290) / 8) * (1-(1)));
        }
        else if (tickAnim >= 298 && tickAnim < 303) {
            xx = 1 + (((tickAnim - 298) / 5) * (1-(1)));
            yy = -0.04 + (((tickAnim - 298) / 5) * (1-(-0.04)));
            zz = 1 + (((tickAnim - 298) / 5) * (1-(1)));
        }
        else if (tickAnim >= 303 && tickAnim < 313) {
            xx = 1 + (((tickAnim - 303) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 303) / 10) * (0.565-(1)));
            zz = 1 + (((tickAnim - 303) / 10) * (1-(1)));
        }
        else if (tickAnim >= 313 && tickAnim < 316) {
            xx = 1 + (((tickAnim - 313) / 3) * (1-(1)));
            yy = 0.565 + (((tickAnim - 313) / 3) * (0.6975-(0.565)));
            zz = 1 + (((tickAnim - 313) / 3) * (1-(1)));
        }
        else if (tickAnim >= 316 && tickAnim < 319) {
            xx = 1 + (((tickAnim - 316) / 3) * (1-(1)));
            yy = 0.6975 + (((tickAnim - 316) / 3) * (0-(0.6975)));
            zz = 1 + (((tickAnim - 316) / 3) * (1-(1)));
        }
        else if (tickAnim >= 319 && tickAnim < 635) {
            xx = 1 + (((tickAnim - 319) / 316) * (1-(1)));
            yy = 0 + (((tickAnim - 319) / 316) * (0-(0)));
            zz = 1 + (((tickAnim - 319) / 316) * (1-(1)));
        }
        else if (tickAnim >= 635 && tickAnim < 650) {
            xx = 1 + (((tickAnim - 635) / 15) * (1-(1)));
            yy = 0 + (((tickAnim - 635) / 15) * (1-(0)));
            zz = 1 + (((tickAnim - 635) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 11.25 + (((tickAnim - 7) / 7) * (0-(11.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 7) / 13) * (0-(7.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.75 + (((tickAnim - 7) / 1) * (17.53-(13.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 17.53 + (((tickAnim - 8) / 6) * (0-(17.53)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-6.62-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6.62 + (((tickAnim - 3) / 4) * (13-(-6.62)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13 + (((tickAnim - 7) / 1) * (30.13-(13)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.13 + (((tickAnim - 8) / 4) * (3.41-(30.13)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 3.41 + (((tickAnim - 12) / 2) * (0-(3.41)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.06-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 26.06 + (((tickAnim - 3) / 4) * (11.5-(26.06)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 7) / 1) * (-4.69-(11.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -4.69 + (((tickAnim - 8) / 4) * (3.28-(-4.69)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 3.28 + (((tickAnim - 12) / 2) * (-10-(3.28)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 17) * (0-(-0.175)));
            zz = -0.15 + (((tickAnim - 3) / 17) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 28 + (((tickAnim - 7) / 1) * (0-(28)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (15.75-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15.75 + (((tickAnim - 14) / 4) * (0-(15.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 3) / 5) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 3) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 10) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 13) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 15) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 18) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2 + (((tickAnim - 20) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.25 + (((tickAnim - 23) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2 + (((tickAnim - 25) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 28) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 30) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 33) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2 + (((tickAnim - 35) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 38) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -2 + (((tickAnim - 40) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 43) / 2) * (5.27-(2.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 5.27 + (((tickAnim - 45) / 10) * (0-(5.27)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 10) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 13) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 15) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 18) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.25 + (((tickAnim - 20) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 6.25 + (((tickAnim - 23) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 25) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 28) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -3.25 + (((tickAnim - 30) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 33) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -3.25 + (((tickAnim - 35) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 38) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -3.25 + (((tickAnim - 40) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 43) / 2) * (3.34-(6.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.34 + (((tickAnim - 45) / 10) * (0-(3.34)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -8.25 + (((tickAnim - 10) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.19 + (((tickAnim - 11) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1 + (((tickAnim - 13) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 15) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.19 + (((tickAnim - 16) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 18) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 20) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.19 + (((tickAnim - 21) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -1 + (((tickAnim - 23) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -8.25 + (((tickAnim - 25) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.19 + (((tickAnim - 26) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 28) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -8.25 + (((tickAnim - 30) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.19 + (((tickAnim - 31) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 33) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -8.25 + (((tickAnim - 35) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.19 + (((tickAnim - 36) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 38) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -8.25 + (((tickAnim - 40) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.19 + (((tickAnim - 41) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 43) / 2) * (-0.63-(-1)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.63 + (((tickAnim - 45) / 10) * (0-(-0.63)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -5.75 + (((tickAnim - 10) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.09 + (((tickAnim - 11) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 13) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -5.75 + (((tickAnim - 15) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.09 + (((tickAnim - 16) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 18) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -5.75 + (((tickAnim - 20) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.09 + (((tickAnim - 21) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 23) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -5.75 + (((tickAnim - 25) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.09 + (((tickAnim - 26) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 28) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -5.75 + (((tickAnim - 30) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.09 + (((tickAnim - 31) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 33) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -5.75 + (((tickAnim - 35) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.09 + (((tickAnim - 36) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 38) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -5.75 + (((tickAnim - 40) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.09 + (((tickAnim - 41) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2 + (((tickAnim - 43) / 2) * (3.24-(2)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.24 + (((tickAnim - 45) / 10) * (0-(3.24)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.74553-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.88216-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.58045-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.74553 + (((tickAnim - 10) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 10) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 10) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -27.12183 + (((tickAnim - 13) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 13) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 13) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -38.74553 + (((tickAnim - 15) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 15) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 15) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.12183 + (((tickAnim - 18) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 18) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 18) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -38.74553 + (((tickAnim - 20) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 20) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 20) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.12183 + (((tickAnim - 23) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 23) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 23) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -38.74553 + (((tickAnim - 25) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 25) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 25) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -27.12183 + (((tickAnim - 28) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 28) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 28) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -38.74553 + (((tickAnim - 30) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 30) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 30) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -27.12183 + (((tickAnim - 33) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 33) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 33) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -38.74553 + (((tickAnim - 35) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 35) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 35) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -27.12183 + (((tickAnim - 38) / 4) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 38) / 4) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 38) / 4) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -38.74553 + (((tickAnim - 42) / 13) * (0-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 42) / 13) * (0-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 42) / 13) * (0-(-1.58045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.77421-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.31702-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15.77421 + (((tickAnim - 10) / 3) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 10) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 10) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -19.75 + (((tickAnim - 13) / 2) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -15.77421 + (((tickAnim - 15) / 3) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 15) / 3) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 15) / 3) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -15.77421 + (((tickAnim - 18) / 2) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 18) / 2) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 18) / 2) * (0-(10.31702)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -19.75 + (((tickAnim - 20) / 3) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.31702-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -15.77421 + (((tickAnim - 23) / 2) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 23) / 2) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 23) / 2) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -15.77421 + (((tickAnim - 25) / 3) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 25) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 25) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 28) / 2) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -15.77421 + (((tickAnim - 30) / 3) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 30) / 3) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 30) / 3) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -15.77421 + (((tickAnim - 33) / 2) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 33) / 2) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 33) / 2) * (0-(10.31702)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -19.75 + (((tickAnim - 35) / 3) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.31702-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -15.77421 + (((tickAnim - 38) / 4) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 38) / 4) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 38) / 4) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -15.77421 + (((tickAnim - 42) / 13) * (0-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 42) / 13) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 42) / 13) * (0-(10.31702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.5 + (((tickAnim - 10) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35.25 + (((tickAnim - 13) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13.5 + (((tickAnim - 15) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35.25 + (((tickAnim - 18) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.5 + (((tickAnim - 20) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -35.25 + (((tickAnim - 23) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -13.5 + (((tickAnim - 25) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -35.25 + (((tickAnim - 28) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 30) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -35.25 + (((tickAnim - 33) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -13.5 + (((tickAnim - 35) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -35.25 + (((tickAnim - 38) / 4) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -13.5 + (((tickAnim - 42) / 13) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 107.25 + (((tickAnim - 13) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 107.25 + (((tickAnim - 18) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 107.25 + (((tickAnim - 23) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 107.25 + (((tickAnim - 28) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 107.25 + (((tickAnim - 33) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 107.25 + (((tickAnim - 38) / 4) * (6-(107.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.62773-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.24749-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.25362-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.62773 + (((tickAnim - 10) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 10) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 10) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.87773 + (((tickAnim - 13) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 13) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 13) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11.62773 + (((tickAnim - 15) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 15) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 15) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.87773 + (((tickAnim - 18) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 18) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 18) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.62773 + (((tickAnim - 20) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 20) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 20) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 12.87773 + (((tickAnim - 23) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 23) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 23) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11.62773 + (((tickAnim - 25) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 25) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 25) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.87773 + (((tickAnim - 28) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 28) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 28) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.62773 + (((tickAnim - 30) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 30) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 30) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.87773 + (((tickAnim - 33) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 33) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 33) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 11.62773 + (((tickAnim - 35) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 35) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 35) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 12.87773 + (((tickAnim - 38) / 4) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 38) / 4) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 38) / 4) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 11.62773 + (((tickAnim - 42) / 13) * (0-(11.62773)));
            yy = 3.24749 + (((tickAnim - 42) / 13) * (0-(3.24749)));
            zz = 2.25362 + (((tickAnim - 42) / 13) * (0-(2.25362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.39605-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.06105-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.98308-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.39605 + (((tickAnim - 10) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 10) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 10) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.96395 + (((tickAnim - 13) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 13) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 13) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.39605 + (((tickAnim - 15) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 15) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 15) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.96395 + (((tickAnim - 18) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 18) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 18) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6.39605 + (((tickAnim - 20) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 20) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 20) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.96395 + (((tickAnim - 23) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 23) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 23) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6.39605 + (((tickAnim - 25) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 25) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 25) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.96395 + (((tickAnim - 28) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 28) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 28) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6.39605 + (((tickAnim - 30) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 30) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 30) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.96395 + (((tickAnim - 33) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 33) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 33) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6.39605 + (((tickAnim - 35) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 35) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 35) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.96395 + (((tickAnim - 38) / 4) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 38) / 4) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 38) / 4) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6.39605 + (((tickAnim - 42) / 13) * (0-(6.39605)));
            yy = -10.06105 + (((tickAnim - 42) / 13) * (0-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 42) / 13) * (0-(1.98308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.52059-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.97607-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.59167-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 27.52059 + (((tickAnim - 10) / 31) * (27.52059-(27.52059)));
            yy = -7.97607 + (((tickAnim - 10) / 31) * (-7.97607-(-7.97607)));
            zz = 2.59167 + (((tickAnim - 10) / 31) * (2.59167-(2.59167)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 27.52059 + (((tickAnim - 41) / 14) * (0-(27.52059)));
            yy = -7.97607 + (((tickAnim - 41) / 14) * (0-(-7.97607)));
            zz = 2.59167 + (((tickAnim - 41) / 14) * (0-(2.59167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 13) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 18) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 23) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 28) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 33) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 38) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.6 + (((tickAnim - 13) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.6 + (((tickAnim - 18) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.6 + (((tickAnim - 23) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -0.6 + (((tickAnim - 28) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.6 + (((tickAnim - 33) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -0.6 + (((tickAnim - 38) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = -31.5 + (((tickAnim - 10) / 31) * (-31.5-(-31.5)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = -31.5 + (((tickAnim - 41) / 14) * (0-(-31.5)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 36.75 + (((tickAnim - 10) / 31) * (36.75-(36.75)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 36.75 + (((tickAnim - 41) / 14) * (0-(36.75)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (25.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 25.75 + (((tickAnim - 10) / 31) * (25.75-(25.75)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 25.75 + (((tickAnim - 41) / 14) * (0-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 10) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.18391 + (((tickAnim - 13) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 13) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 13) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 15) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.18391 + (((tickAnim - 18) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 18) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 18) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 20) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.18391 + (((tickAnim - 23) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 23) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 23) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 25) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.18391 + (((tickAnim - 28) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 28) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 28) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 30) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.18391 + (((tickAnim - 33) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 33) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 33) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 35) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.18391 + (((tickAnim - 38) / 4) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 38) / 4) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 38) / 4) * (0-(10.37068)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = -22.25 + (((tickAnim - 42) / 13) * (0-(-22.25)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 10) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -3.55309 + (((tickAnim - 13) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 13) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 13) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 15) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.55309 + (((tickAnim - 18) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 18) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 18) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 20) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.55309 + (((tickAnim - 23) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 23) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 23) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 25) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.55309 + (((tickAnim - 28) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 28) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 28) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 30) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.55309 + (((tickAnim - 33) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 33) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 33) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 35) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -3.55309 + (((tickAnim - 38) / 4) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 38) / 4) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 38) / 4) * (0-(10.31088)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            yy = -17.75 + (((tickAnim - 42) / 13) * (0-(-17.75)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.7923 + (((tickAnim - 0) / 3) * (-26.5-(-16.7923)));
            yy = -3.48269 + (((tickAnim - 0) / 3) * (0-(-3.48269)));
            zz = 1.3913 + (((tickAnim - 0) / 3) * (0-(1.3913)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -26.5 + (((tickAnim - 3) / 10) * (19-(-26.5)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19 + (((tickAnim - 13) / 7) * (-16.7923-(19)));
            yy = 0 + (((tickAnim - 13) / 7) * (-3.48269-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (1.3913-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 0) / 3) * (-1.25-(12)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -1.25 + (((tickAnim - 3) / 10) * (55.25-(-1.25)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 55.25 + (((tickAnim - 13) / 7) * (12-(55.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 4) * (-0.205-(-0.175)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.125-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = -0.205 + (((tickAnim - 7) / 13) * (0-(-0.205)));
            zz = 0.125 + (((tickAnim - 7) / 13) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -43.75 + (((tickAnim - 0) / 3) * (25-(-43.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 3) / 10) * (-33.75-(25)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -33.75 + (((tickAnim - 13) / 3) * (-17.5-(-33.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 16) / 4) * (-43.75-(-17.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.55 + (((tickAnim - 3) / 4) * (-0.69-(-0.55)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.69 + (((tickAnim - 7) / 6) * (0-(-0.69)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 63.25 + (((tickAnim - 0) / 3) * (0.75-(63.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.75 + (((tickAnim - 3) / 2) * (-5.03-(0.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5.03 + (((tickAnim - 5) / 2) * (-12.56881-(-5.03)));
            yy = 0 + (((tickAnim - 5) / 2) * (-1.92601-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-4.46508-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -12.56881 + (((tickAnim - 7) / 6) * (89.75-(-12.56881)));
            yy = -1.92601 + (((tickAnim - 7) / 6) * (0-(-1.92601)));
            zz = -4.46508 + (((tickAnim - 7) / 6) * (0-(-4.46508)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 89.75 + (((tickAnim - 13) / 4) * (85-(89.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 85 + (((tickAnim - 17) / 3) * (63.25-(85)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 3) * (0.05-(0.575)));
            zz = -0.8 + (((tickAnim - 0) / 3) * (0.495-(-0.8)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 3) / 2) * (0.025-(0.05)));
            zz = 0.495 + (((tickAnim - 3) / 2) * (0.31-(0.495)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 2) * (-0.41-(0.025)));
            zz = 0.31 + (((tickAnim - 5) / 2) * (0.305-(0.31)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.41 + (((tickAnim - 7) / 6) * (0-(-0.41)));
            zz = 0.305 + (((tickAnim - 7) / 6) * (-0.4-(0.305)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.775-(0)));
            zz = -0.4 + (((tickAnim - 13) / 4) * (-0.955-(-0.4)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 17) / 3) * (0.575-(0.775)));
            zz = -0.955 + (((tickAnim - 17) / 3) * (-0.8-(-0.955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (19-(1)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 19 + (((tickAnim - 4) / 6) * (-12.86927-(19)));
            yy = 0 + (((tickAnim - 4) / 6) * (2.61753-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-0.84353-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.86927 + (((tickAnim - 10) / 3) * (-26.5-(-12.86927)));
            yy = 2.61753 + (((tickAnim - 10) / 3) * (0-(2.61753)));
            zz = -0.84353 + (((tickAnim - 10) / 3) * (0-(-0.84353)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -26.5 + (((tickAnim - 13) / 7) * (1-(-26.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 36.5 + (((tickAnim - 0) / 4) * (55.25-(36.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 55.25 + (((tickAnim - 4) / 9) * (-1.25-(55.25)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 13) / 7) * (36.5-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.17 + (((tickAnim - 0) / 13) * (-0.175-(-0.17)));
            zz = 0.125 + (((tickAnim - 0) / 13) * (0-(0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 7) * (-0.17-(-0.175)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.23 + (((tickAnim - 0) / 4) * (-26.75-(12.23)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -26.75 + (((tickAnim - 4) / 3) * (-43.95-(-26.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -43.95 + (((tickAnim - 7) / 3) * (-49.95-(-43.95)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -49.95 + (((tickAnim - 10) / 3) * (25-(-49.95)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 13) / 7) * (12.23-(25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.455 + (((tickAnim - 0) / 4) * (0-(-0.455)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 9) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.55 + (((tickAnim - 13) / 7) * (-0.455-(-0.55)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.43 + (((tickAnim - 0) / 4) * (92.75-(0.43)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 92.75 + (((tickAnim - 4) / 4) * (75.5-(92.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 75.5 + (((tickAnim - 8) / 2) * (73.25-(75.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 73.25 + (((tickAnim - 10) / 3) * (2.5-(73.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 13) / 2) * (-13.94-(2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.94 + (((tickAnim - 15) / 5) * (0.43-(-13.94)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.435 + (((tickAnim - 0) / 4) * (0-(-0.435)));
            zz = 0.04 + (((tickAnim - 0) / 4) * (-0.4-(0.04)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.995-(0)));
            zz = -0.4 + (((tickAnim - 4) / 4) * (-0.965-(-0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.995 + (((tickAnim - 8) / 2) * (0.35-(0.995)));
            zz = -0.965 + (((tickAnim - 8) / 2) * (-0.875-(-0.965)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 3) * (0.3-(0.35)));
            zz = -0.875 + (((tickAnim - 10) / 3) * (0.495-(-0.875)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 13) / 7) * (-0.435-(0.3)));
            zz = 0.495 + (((tickAnim - 13) / 7) * (0.04-(0.495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*1.3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.15);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.12);
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-1), upperbody2.rotateAngleY + (float) Math.toRadians(0), upperbody2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+140))*3.8));
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.8), upperbody.rotateAngleY + (float) Math.toRadians(0), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.8), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.8), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2.8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*2.8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-320))*2.8), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-4), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-340))*2));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus entity = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485+30))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-30))*8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+30))*3.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485))*-0.3);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485))*0.3);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485+30))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+50))*3.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+30))*3.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485+50))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+30))*3.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485+80))*-8), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-230))*-16), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+30))*3.5));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -27.25 + (((tickAnim - 0) / 7) * (19-(-27.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19 + (((tickAnim - 7) / 3) * (-11.41847-(19)));
            yy = 0 + (((tickAnim - 7) / 3) * (-5.75702-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (1.69305-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -11.41847 + (((tickAnim - 10) / 2) * (-27.25-(-11.41847)));
            yy = -5.75702 + (((tickAnim - 10) / 2) * (0-(-5.75702)));
            zz = 1.69305 + (((tickAnim - 10) / 2) * (0-(1.69305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7 + (((tickAnim - 0) / 7) * (55.25-(-7)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 55.25 + (((tickAnim - 7) / 5) * (-7-(55.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 12) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 0) / 7) * (8.75-(25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 8.75 + (((tickAnim - 7) / 2) * (-62.37-(8.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -62.37 + (((tickAnim - 9) / 1) * (-62.37-(-62.37)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -62.37 + (((tickAnim - 10) / 2) * (25-(-62.37)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 3) * (-0.67-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.67 + (((tickAnim - 3) / 4) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.25 + (((tickAnim - 0) / 2) * (-18-(7.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -18 + (((tickAnim - 2) / 1) * (-21.5-(-18)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -21.5 + (((tickAnim - 3) / 4) * (78.5-(-21.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 78.5 + (((tickAnim - 7) / 2) * (72.88-(78.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 72.88 + (((tickAnim - 9) / 1) * (72.88-(72.88)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 72.88 + (((tickAnim - 10) / 2) * (7.25-(72.88)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 2) * (0-(-0.2)));
            zz = 0.495 + (((tickAnim - 0) / 2) * (0-(0.495)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.805-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.805 + (((tickAnim - 3) / 4) * (0-(-0.805)));
            zz = 0.2 + (((tickAnim - 3) / 4) * (-0.8-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.915-(0)));
            zz = -0.8 + (((tickAnim - 7) / 2) * (-0.965-(-0.8)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.915 + (((tickAnim - 9) / 1) * (0.915-(0.915)));
            zz = -0.965 + (((tickAnim - 9) / 1) * (-0.965-(-0.965)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.915 + (((tickAnim - 10) / 2) * (-0.2-(0.915)));
            zz = -0.965 + (((tickAnim - 10) / 2) * (0.495-(-0.965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19 + (((tickAnim - 0) / 5) * (-15.19567-(19)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.69401-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.72421-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15.19567 + (((tickAnim - 5) / 2) * (-26.5-(-15.19567)));
            yy = 4.69401 + (((tickAnim - 5) / 2) * (0-(4.69401)));
            zz = -1.72421 + (((tickAnim - 5) / 2) * (0-(-1.72421)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -26.5 + (((tickAnim - 7) / 5) * (19-(-26.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 55.25 + (((tickAnim - 0) / 7) * (-3.25-(55.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -3.25 + (((tickAnim - 7) / 5) * (55.25-(-3.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 7) / 5) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.75 + (((tickAnim - 0) / 3) * (-60.72-(8.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -60.72 + (((tickAnim - 3) / 1) * (-60.72-(-60.72)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -60.72 + (((tickAnim - 4) / 3) * (25-(-60.72)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 25 + (((tickAnim - 7) / 5) * (8.75-(25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 7) / 1) * (-0.57-(0.275)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.57 + (((tickAnim - 8) / 4) * (0-(-0.57)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 78.5 + (((tickAnim - 0) / 3) * (76.75-(78.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 76.75 + (((tickAnim - 3) / 1) * (76.75-(76.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 76.75 + (((tickAnim - 4) / 3) * (1-(76.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 7) / 1) * (-29-(1)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -29 + (((tickAnim - 8) / 4) * (78.5-(-29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.755-(0)));
            zz = -0.8 + (((tickAnim - 0) / 3) * (-1.035-(-0.8)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.755 + (((tickAnim - 3) / 1) * (0.755-(0.755)));
            zz = -1.035 + (((tickAnim - 3) / 1) * (-1.035-(-1.035)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.755 + (((tickAnim - 4) / 3) * (-0.2-(0.755)));
            zz = -1.035 + (((tickAnim - 4) / 3) * (0.495-(-1.035)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 7) / 1) * (-0.655-(-0.2)));
            zz = 0.495 + (((tickAnim - 7) / 1) * (0.2-(0.495)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.655 + (((tickAnim - 8) / 4) * (0-(-0.655)));
            zz = 0.2 + (((tickAnim - 8) / 4) * (-0.8-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485+160))*3), upperbody2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+60))*4), upperbody2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+140))*4));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-40))*5), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+120))*3), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-60))*-5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-60))*7), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-60))*-5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-60))*7), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-30))*-5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+170))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-120))*5), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+190))*5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/0.485-100))*-4), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+290))*-5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*-4));

    }

    
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPsittacosaurus_sibiricus e = (EntityPrehistoricFloraPsittacosaurus_sibiricus) entity;
        animator.update(entity);


    }
}
