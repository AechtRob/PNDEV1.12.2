package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSynophalos;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSynophalos extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tailx1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tailx2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tailx4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tailx8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body14;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer body15;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer body16;
    private final AdvancedModelRenderer tail16;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tailx16;
    private final AdvancedModelRenderer cube_r32;

    public ModelSynophalos() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.0F, 0.0F, 3, 3, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -1.0F, -0.75F, 3.0F, 2, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 10, -0.99F, -0.25F, 7.0F, 2, 1, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body.addChild(tail1);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.tail1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.tailx1 = new AdvancedModelRenderer(this);
        this.tailx1.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body.addChild(tailx1);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.tailx1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 0, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 20, 0, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 20, 8, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 28, 10, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body2.addChild(tail2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 0, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.tailx2 = new AdvancedModelRenderer(this);
        this.tailx2.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body2.addChild(tailx2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailx2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 40, 0, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 40, 8, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 48, 10, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 0, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 0, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 40, 0, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 40, 8, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 48, 10, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body4.addChild(tail4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 0, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.tailx4 = new AdvancedModelRenderer(this);
        this.tailx4.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body4.addChild(tailx4);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailx4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 0, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 8, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 8, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1745F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 8, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1745F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 0, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 8, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body8.addChild(tail8);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1745F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.tailx8 = new AdvancedModelRenderer(this);
        this.tailx8.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body8.addChild(tailx8);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailx8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1745F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body9.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body9.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body10.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1745F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body10.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1745F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 20, 23, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body11.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1745F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body11.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1745F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body12.cubeList.add(new ModelBox(body12, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body12.cubeList.add(new ModelBox(body12, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body12.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body12.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.1745F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body13.cubeList.add(new ModelBox(body13, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));
        this.body13.cubeList.add(new ModelBox(body13, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body13.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1745F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body13.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1745F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body14 = new AdvancedModelRenderer(this);
        this.body14.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body13.addChild(body14);
        this.body14.cubeList.add(new ModelBox(body14, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body14.cubeList.add(new ModelBox(body14, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body14.cubeList.add(new ModelBox(body14, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body14.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.1745F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body14.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.1745F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body15 = new AdvancedModelRenderer(this);
        this.body15.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body14.addChild(body15);
        this.body15.cubeList.add(new ModelBox(body15, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));
        this.body15.cubeList.add(new ModelBox(body15, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));
        this.body15.cubeList.add(new ModelBox(body15, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body15.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.1745F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body15.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.1745F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body16 = new AdvancedModelRenderer(this);
        this.body16.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body15.addChild(body16);
        this.body16.cubeList.add(new ModelBox(body16, 20, 15, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));
        this.body16.cubeList.add(new ModelBox(body16, 28, 25, -0.99F, -0.25F, 6.0F, 2, 1, 4, 0.0F, false));
        this.body16.cubeList.add(new ModelBox(body16, 20, 23, -1.0F, -0.75F, 2.0F, 2, 2, 4, 0.0F, false));

        this.tail16 = new AdvancedModelRenderer(this);
        this.tail16.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body16.addChild(tail16);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail16.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.1745F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 15, -0.25F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.tailx16 = new AdvancedModelRenderer(this);
        this.tailx16.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.body16.addChild(tailx16);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailx16.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.1745F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 15, -0.75F, -0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.112F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.006f);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.body.offsetY = 1.3F;

        //AdvancedModelRenderer[] wave1 = {this.body};
        //AdvancedModelRenderer[] wave2 = {this.body, this.body2};
        //AdvancedModelRenderer[] wave4 = {this.body, this.body2, this.body3, this.body4};
        //AdvancedModelRenderer[] wave8 = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8};
        AdvancedModelRenderer[] wave16 = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14, this.body15, this.body16};

        //chain rendering:
        EntityPrehistoricFloraSynophalos entity = (EntityPrehistoricFloraSynophalos) e;
        //System.err.println("Chain: " + entity.getChain());
        this.body.rotateAngleX = 0.05F;
        this.chainWave(wave16, 0.3F, 0.5F, -16, f2, 0.5F);
        this.chainSwing(wave16, 0.3F, 0.2F, -16, f2, 0.5F);
        this.swing(body, 0.3F, 0.15F, true, 0, 0, f2, 0.5F);
        this.bob(body, 0.3F, 0.15F, false, f2, 0.5F);
        this.walk(body, 0.3F, 0.3F, false, 2.5F, -0.1F, f2, 0.5F);

        switch (entity.getChain()) {
            case 1:
            default:
                this.swing(tail1, 0.8F, 0.3F, false, 0F, -0.3F, f2, 1F);
                this.swing(tailx1, 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
                this.walk(tail1, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
                this.walk(tailx1, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
            break;

            case 2:
                this.swing(tail2, 0.8F, 0.3F, false, 0F, -0.3F, f2, 1F);
                this.swing(tailx2, 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
                this.walk(tail2, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
                this.walk(tailx2, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
            break;

            case 4:
                this.swing(tail4, 0.8F, 0.3F, false, 0F, -0.3F, f2, 1F);
                this.swing(tailx4, 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
                this.walk(tail4, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
                this.walk(tailx4, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
            break;

            case 8:
                this.swing(tail8, 0.8F, 0.3F, false, 0F, -0.3F, f2, 1F);
                this.swing(tailx8, 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
                this.walk(tail8, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
                this.walk(tailx8, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
            break;

            case 16:
                this.swing(tail16, 0.8F, 0.3F, false, 0F, -0.3F, f2, 1F);
                this.swing(tailx16, 0.8F, 0.3F, true, 0F, -0.3F, f2, 1F);
                this.walk(tail16, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
                this.walk(tailx16, 1.0F, 0.3F, false, 0F, 0F, f2, 1F);
            break;
        }

        if (!e.isInWater()) {
            this.bob(body, 1.2F, 2F, false, f2, 1);
        }

    }
}
