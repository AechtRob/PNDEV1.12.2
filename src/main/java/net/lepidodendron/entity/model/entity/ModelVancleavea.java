package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVancleavea;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVancleavea extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegL5;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegR3;
    private final AdvancedModelRendererExtended hindlegR5;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegL3;
    private final AdvancedModelRendererExtended forelegL5;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegR2;
    private final AdvancedModelRendererExtended forelegR3;
    private final AdvancedModelRendererExtended forelegR5;

    private ModelAnimator animator;

    public ModelVancleavea() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 19.5F, -22.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -11.0F, 19.5F, 10, 11, 12, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, -5.75F, 31.5F);
        this.body.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 34, 23, -4.5F, -4.75F, -1.0F, 9, 10, 8, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(3.75F, -0.3F, 5.0F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.5672F, 0.0F);


        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, -0.7418F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 0, 23, -1.5F, 0.0F, -1.5F, 2, 7, 3, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, 0.0F, 0.7418F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 0, 80, -0.999F, 0.0F, -1.49F, 2, 4, 3, 0.0F, false));

        this.hindlegL5 = new AdvancedModelRendererExtended(this);
        this.hindlegL5.setRotationPoint(-0.25F, 4.0F, 0.5F);
        this.hindlegL3.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, -0.8727F, 0.0F);
        this.hindlegL5.cubeList.add(new ModelBox(hindlegL5, 75, 65, -2.75F, 0.0F, -3.75F, 5, 1, 5, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(-3.75F, -0.3F, 5.0F);
        this.body3.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.5672F, 0.0F);


        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.0F, 0.7418F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 0, -0.5F, 0.0F, -1.5F, 2, 7, 3, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 0.0F, 0.0F, -0.7418F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 0, 63, -1.001F, 0.0F, -1.49F, 2, 4, 3, 0.0F, false));

        this.hindlegR5 = new AdvancedModelRendererExtended(this);
        this.hindlegR5.setRotationPoint(0.25F, 4.0F, 0.5F);
        this.hindlegR3.addChild(hindlegR5);
        this.setRotateAngle(hindlegR5, 0.0F, 0.8727F, 0.0F);
        this.hindlegR5.cubeList.add(new ModelBox(hindlegR5, 32, 0, -2.25F, 0.0F, -3.75F, 5, 1, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 47, 61, -3.0F, -3.75F, -1.0F, 6, 8, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, -2.0F, -3.5F, -0.5F, 4, 8, 13, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 76, -0.5F, -7.5F, 6.5F, 1, 4, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 23, -0.5F, -6.5F, 4.5F, 1, 3, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 7, 0, -0.5F, -5.5F, 3.5F, 1, 2, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 10, -0.5F, -4.5F, 2.5F, 1, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 59, -1.5F, -2.75F, -1.0F, 3, 6, 11, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 66, -0.49F, -6.75F, 0.0F, 1, 4, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 29, -0.5F, -4.5F, 0.0F, 1, 3, 12, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 46, -1.0F, -1.5F, -1.0F, 2, 4, 13, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 46, 45, -0.5F, -0.75F, -1.0F, 1, 2, 14, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 55, 16, -0.5F, -1.75F, 7.0F, 1, 1, 4, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 36, 59, -0.49F, -2.75F, 0.0F, 1, 2, 7, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -5.75F, 20.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 41, -4.5F, -4.75F, -7.5F, 9, 10, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 60, 16, -4.0F, -4.75F, -12.5F, 8, 8, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 3.25F, -12.5F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 0, -3.5F, -2.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -2.25F, -12.5F);
        this.body2.addChild(neck1);
        this.setRotateAngle(neck1, -0.3491F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 44, 0, -3.5F, -2.1F, -7.0F, 7, 7, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 70, 29, -3.0F, -3.0F, -5.0F, 6, 6, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.neck2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 56, -2.49F, -2.0F, -5.0F, 5, 3, 6, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 94, 8, -2.0F, 1.25F, -2.75F, 4, 3, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 62, 44, -2.5F, -4.0F, -7.0F, 5, 4, 8, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 10, 9, -2.2F, -0.5F, -5.5F, 0, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 10, 8, -2.2F, -0.5F, -4.0F, 0, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 10, 6, 2.2F, -0.5F, -5.5F, 0, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 10, 7, 2.2F, -0.5F, -4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 79, -2.0F, -2.4F, -1.55F, 4, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 8, -2.0F, -3.4F, -2.95F, 4, 1, 5, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 33, -2.0F, -1.4F, -0.45F, 4, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 16, -1.5F, -1.125F, -4.45F, 3, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 44, 1.05F, -1.075F, -4.425F, 1, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.4F, -0.425F, -4.275F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 0, -1.4F, -0.425F, -4.275F, 1, 1, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, 1.75F, -0.325F, -3.925F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 10, 1.75F, -0.325F, -2.425F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, -1.75F, -0.325F, -2.425F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 23, -1.75F, -0.325F, -3.925F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 50, -2.05F, -1.075F, -4.425F, 1, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.25F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 2.1F, -0.575F, 0.25F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-0.25F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, -0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 9, -2.1F, -0.575F, 0.25F, 0, 2, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 69, 71, -2.5F, 0.0F, -5.2F, 5, 2, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 10, 3, 2.375F, -0.6F, -4.5F, 0, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 10, 2, -2.375F, -0.6F, -4.5F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0F, 0.75F, -11.0F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 9, 0.6707F, -1.99F, 2.9653F, 0, 2, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 22, 0.6207F, -1.29F, 1.3153F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 4, 0.6207F, -1.34F, 5.0653F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.0F, 0.75F, -11.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 22, -0.225F, -1.24F, -0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.75F, -11.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 22, 0.225F, -1.24F, -0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.65F, -11.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 5, -0.6207F, -1.24F, 5.0653F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 22, -0.6207F, -1.19F, 1.3153F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 9, -0.6707F, -1.89F, 2.9653F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 23, -2.0F, -1.95F, -0.25F, 4, 2, 6, 0.0F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(-1.0F, 1.525F, 2.0F);
        this.lowerjaw.addChild(bone);
        this.setRotateAngle(bone, 0.0262F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 12, 63, -0.49F, -1.7181F, -13.0702F, 3, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.bone.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 77, -1.3477F, -0.7081F, -4.8872F, 1, 1, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(1.0F, -0.5F, -5.0F);
        this.bone.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2094F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 77, -2.0F, 0.1002F, -5.6814F, 4, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(2.0F, -1.0F, -8.0F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1309F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 77, 0.3477F, -0.7081F, -4.8872F, 1, 1, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(1.0F, -0.5F, -8.0F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0785F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 31, -1.5F, -0.8255F, -5.072F, 3, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(3.5F, 1.75F, -11.0F);
        this.body2.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.5236F, 0.0F);


        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.0F, -0.6981F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 54, 77, -1.75F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(-0.75F, 4.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, 0.0F, 0.6981F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 70, -0.999F, 0.0F, -0.99F, 2, 4, 2, 0.0F, false));

        this.forelegL5 = new AdvancedModelRendererExtended(this);
        this.forelegL5.setRotationPoint(-0.25F, 4.0F, 0.0F);
        this.forelegL3.addChild(forelegL5);
        this.forelegL5.cubeList.add(new ModelBox(forelegL5, 24, 76, -1.75F, 0.0F, -2.75F, 4, 1, 4, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-3.5F, 1.75F, -11.0F);
        this.body2.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.5236F, 0.0F);


        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, 0.0F, 0.6981F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 62, 44, -0.25F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRendererExtended(this);
        this.forelegR3.setRotationPoint(0.75F, 4.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0F, 0.0F, -0.6981F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 17, 49, -1.001F, 0.0F, -0.99F, 2, 4, 2, 0.0F, false));

        this.forelegR5 = new AdvancedModelRendererExtended(this);
        this.forelegR5.setRotationPoint(0.25F, 4.0F, 0.0F);
        this.forelegR3.addChild(forelegR5);
        this.forelegR5.cubeList.add(new ModelBox(forelegR5, 17, 44, -2.25F, 0.0F, -2.75F, 4, 1, 4, 0.0F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(neck1, -0.2F, -0.4F, 0.0F);
        this.setRotateAngle(neck2, 0.3F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.3F, 0.4F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.neck1.offsetY = 0.0F;
        this.neck1.offsetX = 0.0F;
        this.neck1.offsetZ = -0.0F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.05F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(neck1, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(forelegL, 0.5F, 0.0F, -0.3F);
        this.setRotateAngle(forelegL3, 0.0F, 0.0F, 0.9F);
        this.setRotateAngle(forelegR, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(forelegR3, 0.0F, 0.0F, -0.7F);
        this.setRotateAngle(hindlegL, 0.0F, 0.0F, -0.6F);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hindlegL3, 0.0F, 0.0F, 0.6F);
        this.setRotateAngle(hindlegR, 0.5F, 0.0F, 0.6F);
        this.setRotateAngle(hindlegR2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hindlegR3, 0.5F, -0.3F, -0.6F);
        this.body.offsetY = -0.095F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        this.body.offsetY = 0.00F;

        EntityPrehistoricFloraVancleavea Vancleavea = (EntityPrehistoricFloraVancleavea) e;
        float masterSpeed = Vancleavea.getTravelSpeed();

        this.faceTarget(f3, f4, 5, neck1);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.neck1, this.neck2, this.head};
        Vancleavea.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] Whole = {this.head, this.neck2, this.neck1, this.body2, this.body, this.body3, this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        AdvancedModelRenderer[] BackLeft = {this.hindlegL2, this.hindlegL3, this.hindlegL5};
        AdvancedModelRenderer[] BackRight = {this.hindlegR2, this.hindlegR3, this.hindlegR5};
        AdvancedModelRenderer[] FrontLeft = {this.forelegL2, this.forelegL3, this.forelegL5};
        AdvancedModelRenderer[] FrontRight = {this.forelegR2, this.forelegR3, this.forelegR5};

        if (Vancleavea.getAnimation() == Vancleavea.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.08F, false, 0.5F,-0.04F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        float speed = masterSpeed / 0.785F;
        if (Vancleavea.getIsFast()) {
            speed = speed * 1.5F;
        }

        if (!Vancleavea.isReallyInWater()) {

            if (f3 == 0.0F || !Vancleavea.getIsMoving()) {
                this.swing(neck1, 0.06F, 0.08F, false, 0.5F,-0.04F, f2, 0.8F);
                this.walk(neck1, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
                this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
                this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
                return;
            }

            this.forelegL2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.2), false, 1, f2, 1.5F);;
            this.forelegR2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.2), false, 4, f2, 1.5F);;
            this.hindlegL2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.15), false, 4, f2, 1.5F);;
            this.hindlegR2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.15), false, 1, f2, 1.5F);;

            this.flap(forelegL2, speed, -0.1F, true, 4, 0.05F, f2, 1F);
            this.flap(forelegR2, speed, 0.1F, true, 7, -0.05F, f2, 1F);
            this.flap(hindlegL2, speed, 0.1F, false, 7, -0.05F, f2, 1F);
            this.flap(hindlegR2, speed, -0.1F, false, 4, 0.05F, f2, 1F);

            this.walk(forelegL2, speed, -0.40F, true, 0, 0.18F, f2, 1F);
            this.walk(forelegR2, speed, -0.40F, true, 3, 0.18F, f2, 1F);
            this.walk(hindlegL2, speed, -0.30F, true, 3, 0F, f2, 1F);
            this.walk(hindlegR2, speed, -0.30F, true, 0, 0F, f2, 1F);

            this.swing(forelegL3, speed, -0.25F, true, 6, 0F, f2, 1F);
            this.swing(forelegR3, speed, 0.25F, true, 9, 0F, f2, 1F);
            this.swing(hindlegL5, speed, -0.20F, true, 9, 0F, f2, 1F);
            this.swing(hindlegR5, speed, 0.20F, true, 6, 0F, f2, 1F);

            this.flap(forelegL3, speed, 0.10F, true, 0, 0.05F, f2, 1F);
            this.flap(forelegR3, speed, -0.10F, true, 3, -0.05F, f2, 1F);
            this.flap(hindlegL5, speed, -0.10F, false, 3, -0.05F, f2, 1F);
            this.flap(hindlegR5, speed, 0.10F, false, 0, 0.05F, f2, 1F);

            this.swing(forelegL5, speed, -0.30F, true, 2, 0.10F, f2, 1F);
            this.swing(forelegR5, speed, 0.30F, true, 5, -0.10F, f2, 1F);
            this.swing(hindlegL5, speed, -0.25F, true, 5, 0.08F, f2, 1F);
            this.swing(hindlegR5, speed, 0.25F, true, 2, -0.08F, f2, 1F);

            this.bobExtended(body, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

            this.flap(body, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
            this.flap(body2, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
            this.flap(body3, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

            this.swing(neck1, speed, 0.06F, false, 0.5F,-0.03F, f2, 0.8F);
            this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            this.swing(neck2, speed, 0.06F, false, 1.5F,-0.03F, f2, 0.8F);
            this.walk(neck2, speed * 3, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.4), false, 1.5F, f2, 1);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            //Swimming pose:
            speed = masterSpeed / 1.265F;
            if (Vancleavea.getIsFast()) {
                speed = speed * 1.5F;
            }

            this.setRotateAngle(neck1, (float)Math.toRadians(-5), 0, 0);
            this.setRotateAngle(head, (float)Math.toRadians(7.5), 0, 0);
            this.setRotateAngle(forelegL, (float)Math.toRadians(50), 0, 0);
            this.setRotateAngle(forelegR, (float)Math.toRadians(50), 0, 0);
            this.setRotateAngle(forelegL5, (float)Math.toRadians(80), 0, 0);
            this.setRotateAngle(forelegR5, (float)Math.toRadians(80), 0, 0);
            this.setRotateAngle(hindlegL, (float)Math.toRadians(65), 0, (float)Math.toRadians(42.5));
            this.setRotateAngle(hindlegR, (float)Math.toRadians(65), 0, (float)Math.toRadians(-42.5));
            this.setRotateAngle(hindlegL5, (float)Math.toRadians(75), (float)Math.toRadians(12.5), 0);
            this.setRotateAngle(hindlegR5, (float)Math.toRadians(75), (float)Math.toRadians(-12.5), 0);

            speed = speed * 1.5F;

            this.chainWave(Whole, speed * 0.5F, 0.0125F, -3.2, f2, 1);
            this.chainSwing(Whole, speed * 0.5F, 0.125F, -1.75, f2, 1);
            this.walk(neck1, speed, -0.06F, false, 0F, -0.03F, f2, 1F);
            this.walk(neck2, speed, -0.06F, false, 1F, -0.03F, f2, 1F);
            this.chainWaveExtended(BackLeft, speed, -0.05F, -0.05, 0F, f2, 1);
            this.chainWaveExtended(BackRight, speed, -0.05F, -0.05, 3F, f2, 1);
            this.chainWaveExtended(FrontLeft, speed, -0.05F, -0.05, 3F, f2, 1);
            this.chainWaveExtended(FrontRight, speed, -0.05F, -0.05, 0F, f2, 1);
            this.chainSwingExtended(BackLeft, speed, -0.025F, -0.05, 0F, f2, 1);
            this.chainSwingExtended(BackRight, speed, 0.025F, 0.05, 3F, f2, 1);
            this.chainSwingExtended(FrontLeft, speed, -0.025F, -0.05, 3F, f2, 1);
            this.chainSwingExtended(FrontRight, speed, 0.025F, 0.05, 0F, f2, 1);
            this.bob(body, speed, 0.055F, false, f2, 1);
            this.walk(body, speed * 0.5F, 0.03F, false, 0F, 0.015F, f2, 1);

            if (f3 == 0.0F) {
                return;
            }

            //this.chainSwing(Tail, speed, 0.05F, -2, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraVancleavea e = (EntityPrehistoricFloraVancleavea) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
