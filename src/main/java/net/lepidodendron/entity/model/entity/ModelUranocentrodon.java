package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraUranocentrodon;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelUranocentrodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;

    private ModelAnimator animator;

    public ModelUranocentrodon() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 20.5F, 22.5F);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 35, 24, -4.0F, -2.0F, -1.0F, 8, 5, 9, -0.02F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(3.0F, 0.75F, 5.75F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.6545F, 0.1745F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 0, 77, -0.5F, -1.0F, -2.0F, 5, 2, 4, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(4.5F, 0.0F, -0.25F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -1.0036F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 83, 0, -0.75F, -1.0F, -1.25F, 5, 2, 3, -0.01F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(3.5F, 0.0F, -0.25F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.0873F, 1.5708F, -0.2618F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 81, 32, -0.75F, 0.0F, -1.5F, 4, 1, 4, 0.0F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-3.0F, 0.75F, 5.75F);
        this.body4.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.6545F, -0.1745F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 46, 58, -4.5F, -1.0F, -2.0F, 5, 2, 4, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-4.5F, 0.0F, -0.25F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 1.0036F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 59, 71, -4.25F, -1.0F, -1.25F, 5, 2, 3, -0.01F, false));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-3.5F, 0.0F, -0.25F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.0873F, -1.5708F, 0.2618F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 38, 68, -3.25F, 0.0F, -1.5F, 4, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.0087F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 55, 58, -3.0F, -1.5F, -1.0F, 6, 4, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 68, -2.0F, -1.75F, -1.0F, 4, 4, 9, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 69, 42, -1.5F, -1.25F, -1.0F, 3, 3, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 47, -1.0F, -0.75F, -1.0F, 2, 2, 13, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body4.addChild(body3);
        this.setRotateAngle(body3, 0.0393F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 35, 8, -4.5F, -2.5F, -9.0F, 9, 5, 9, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 44, 48, -4.0F, -2.9F, -9.0F, 8, 1, 9, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.5F, -8.5F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 58, -4.0F, -0.5F, -0.5F, 8, 1, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -5.5F, -3.0F, -11.0F, 11, 6, 11, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.body2.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -6.0F, -2.0F, -10.0F, 12, 6, 10, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(5.75F, 2.0F, -8.25F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.3491F, 0.1745F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 84, 20, -0.5F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 1.2217F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 84, 46, -0.25F, -1.0F, -1.0F, 4, 2, 2, -0.01F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, 0.25F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.1309F, 0.5236F, -0.0436F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 84, 42, 0.25F, 0.0F, -1.5F, 3, 1, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-5.75F, 2.0F, -8.25F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.3491F, -0.1745F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 0, 84, -4.5F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -1.2217F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 83, 5, -3.75F, -1.0F, -1.0F, 4, 2, 2, -0.01F, false));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-3.0F, 0.0F, 0.25F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.1309F, -0.5236F, 0.0436F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 59, 0, -3.25F, 0.0F, -1.5F, 3, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 33, -5.5F, -2.5F, -8.0F, 11, 5, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, -8.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 38, -5.0F, 0.5F, 0.0F, 10, 1, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, -6.5F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 48, -5.0F, -1.325F, -1.175F, 10, 1, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.5F, 0.0F, 0.0F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.096F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 71, 0.0F, -2.5F, -8.0F, 2, 5, 8, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(5.5F, 0.0F, 0.0F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.096F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 71, -2.0F, -2.5F, -8.0F, 2, 5, 8, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.neck.addChild(head);


        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 62, 0, -3.0F, -1.005F, -8.8F, 6, 1, 9, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 33, 8, -1.5F, -0.5F, -14.75F, 3, 1, 0, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 31, 81, -2.0F, -1.005F, -13.8F, 4, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 22, -4.0F, -1.3F, 7.0F, 8, 2, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 42, -2.5F, -1.0F, 3.0F, 5, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 84, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.0F, -15.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.1345F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -5.0F, -0.51F, 0.25F, 4, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 81, 37, -5.0F, -1.01F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.0F, -15.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.2828F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, -7.925F, -0.52F, -0.65F, 3, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -12.925F, -0.5F, -0.65F, 5, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 54, -15.925F, -2.0F, -0.9F, 8, 2, 4, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 83, 80, -7.925F, -1.02F, -0.9F, 3, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 0.0F, -15.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.1345F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 19, 1.0F, -0.51F, 0.25F, 4, 1, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 76, 0.0F, -1.015F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -0.75F, -6.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1833F, 0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, -0.25F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 0.0F, -15.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.2828F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 9, 7.925F, -0.5F, -0.65F, 5, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 60, 7.925F, -2.0F, -0.9F, 8, 2, 4, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 33, 4.925F, -0.52F, -0.65F, 3, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 84, 25, 4.925F, -1.02F, -0.9F, 3, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.75F, -6.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1833F, -0.2618F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 21, -0.75F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 13, 81, -2.0F, -0.005F, -13.7F, 4, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 62, -3.0F, -0.005F, -8.7F, 6, 1, 9, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 3, -1.5F, 0.0F, -14.975F, 3, 1, 2, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 4, 20, -1.5F, -0.5F, -14.6F, 3, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, 0.0F, -15.0F);
        this.lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.2828F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 7, 7.925F, -0.5F, -0.4F, 5, 1, 0, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 25, 4.925F, -0.52F, -0.4F, 3, 1, 0, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 62, 10, 4.925F, -0.025F, -0.8F, 11, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 0.0F, -15.0F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -1.1345F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 17, 1.0F, -0.51F, 0.5F, 4, 1, 0, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 73, 0.0F, -0.015F, 0.1F, 5, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 0.0F, -15.0F);
        this.lowerjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.2828F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 6, -12.925F, -0.5F, -0.4F, 5, 1, 0, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 24, -7.925F, -0.52F, -0.4F, 3, 1, 0, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 0, -15.925F, -0.02F, -0.8F, 11, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 0.0F, -15.0F);
        this.lowerjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.1345F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 10, -5.0F, -0.51F, 0.5F, 4, 1, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 64, -5.0F, -0.01F, 0.1F, 5, 1, 2, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, -15.0F);
        this.lowerjaw.addChild(bone);
        this.setRotateAngle(bone, -0.0829F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -1.0F, 0.025F, 3, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 79, 71, -2.0F, -1.005F, 1.3F, 4, 1, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 60, 32, -3.0F, -1.005F, 6.3F, 6, 1, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.1345F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 5, -5.0F, -1.01F, 0.1F, 5, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.2828F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 72, -14.925F, -1.02F, -0.8F, 10, 1, 4, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 47, -14.925F, -2.02F, -0.8F, 2, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.1345F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 5, 0.0F, -1.01F, 0.1F, 5, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.2828F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 52, 12.925F, -2.02F, -0.8F, 2, 1, 4, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 71, 15, 4.925F, -1.02F, -0.8F, 10, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body4.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.3F, 0.0F, 0.0F);
        this.body.offsetY = -0.02F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 0.09F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(forelegL, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(forelegL2, 0.0F, 0.5F, 0.4F);
        this.setRotateAngle(forelegL3, 0.6F, 0.5F, -0.2F);
        this.setRotateAngle(forelegR, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(forelegR2, 0.0F, -0.5F, -0.4F);
        this.setRotateAngle(forelegR3, 0.8F, -0.7F, -0.2F);
        this.setRotateAngle(hindlegL, 0.0F, 0.2F, 0.3F);
        this.setRotateAngle(hindlegL2, 0.0F, -0.7F, 0.0F);
        this.setRotateAngle(hindlegL3, 0.5F, 1.5F, 0.0F);
        this.setRotateAngle(hindlegR, 0.0F, 0.2F, -0.3F);
        this.setRotateAngle(hindlegR2, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(hindlegR3, 0.5F, -1.5F, 0.0F);
        this.body4.offsetZ = -0.09F;
        this.body4.offsetY = -0.08F;
        this.body4.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body4.offsetY = -0.8F;
        this.body4.offsetX = 0.1F;
        this.body4.offsetZ = 2.0F;
        this.body4.rotateAngleY = (float)Math.toRadians(120);
        this.body4.rotateAngleX = (float)Math.toRadians(0);
        this.body4.rotateAngleZ = (float)Math.toRadians(0);
        this.body4.scaleChildren = true;
        float scaler = 0.5F;
        this.body4.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body4, 0.3F, 3.8F, -0.2F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(forelegL, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(forelegL2, 0.0F, 0.5F, 0.4F);
        this.setRotateAngle(forelegL3, 0.6F, 0.5F, -0.2F);
        this.setRotateAngle(forelegR, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(forelegR2, 0.0F, -0.5F, -0.4F);
        this.setRotateAngle(forelegR3, 0.8F, -0.7F, -0.2F);
        this.setRotateAngle(hindlegL, 0.0F, 0.2F, 0.3F);
        this.setRotateAngle(hindlegL2, 0.0F, -0.7F, 0.0F);
        this.setRotateAngle(hindlegL3, 0.5F, 1.5F, 0.0F);
        this.setRotateAngle(hindlegR, 0.0F, 0.2F, -0.3F);
        this.setRotateAngle(hindlegR2, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(hindlegR3, 0.5F, -1.5F, 0.0F);
        //End of pose, now render the model:
        this.body4.render(f);
        //Reset rotations, positions and sizing:
        this.body4.setScale(1.0F, 1.0F, 1.0F);
        this.body4.scaleChildren = false;
        resetToDefaultPose();

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
        //this.body4.offsetY = 0.725F; //72

        EntityPrehistoricFloraUranocentrodon Uranocentrodon = (EntityPrehistoricFloraUranocentrodon) e;

        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 6, head);

        float speed = 0.225F / 1.5F;
        if (Uranocentrodon.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] TailLand = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.body2, this.body3, this.body4};
        Uranocentrodon.tailBuffer.applyChainSwingBuffer(TailLand);

        if (!Uranocentrodon.isReallyInWater()) { //on land

            if (f3 == 0.0F || !Uranocentrodon.getIsMoving()) { //Not moving
                return;
            }

            this.flap(hindlegL, speed, 0.15F, false, 0, 0.075F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(hindlegL3, speed, 0.3F, false, 3, 0.1F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.15F, false, 0, -0.075F, f2, 0.5F);
            this.swing(hindlegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(hindlegR3, speed, 0.3F, false, 6, 0.1F, f2, 0.5F);

            this.flap(forelegL, speed, 0.15F, false, 3, 0.075F, f2, 0.5F);
            this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(forelegL2, speed, -0.6F, true, 3, 0.4F, f2, 0.8F);

            this.flap(forelegR, speed, -0.15F, false, 3, -0.075F, f2, 0.5F);
            this.swing(forelegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(forelegR2, speed, 0.6F, false, 6, 0.3F, f2, 0.5F);

            //this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(TailLand, speed, 0.07F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.04F, -0.1, f2, 0.7F);
            this.bob(body4, speed*2, 0.1F, false, f2, 1F);

            this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.5), false, 2.5F, f2, 1);

        }
        else { //Is in water
            speed = speed * 4F;

            //Feet:

            AdvancedModelRenderer[] BackL = {this.hindlegL, this.hindlegL2};
            AdvancedModelRenderer[] BackR = {this.hindlegR, this.hindlegR2};

            this.flap(hindlegL, speed * 0.6F, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(hindlegR, speed * 0.6F, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainSwingExtended(BackL, speed * 0.6F, -0.3F, -1, -3F, f2, 1);
            this.chainSwingExtended(BackR, speed*0.6F, -0.3F, -1, 3F, f2, 1);

            this.flap(forelegL, speed * 0.6F, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(forelegL, speed * 0.6F, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(forelegL2, speed * 0.6F, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(forelegR, speed * 0.6F, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed * 0.6F, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(forelegR2, speed * 0.6F, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(TailLand, speed * 0.25F, 0.012F, -0.2, f2, 0.5F);
            this.chainSwing(TailLand, speed * 0.25F, 0.15F, -2.8, f2, 0.5F);
            this.chainSwing(Torso, speed * 0.25F, 0.1F, -0.12, f2, 0.7F);
            this.swing(body4, speed * 0.5F, 0.05F, true, 0, 0, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
