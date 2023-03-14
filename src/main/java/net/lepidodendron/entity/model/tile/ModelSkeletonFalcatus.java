package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFalcatus extends AdvancedModelBase {
    private final AdvancedModelRenderer falcatus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftBackFin;
    private final AdvancedModelRenderer rightBackFin;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftFrontFin;
    private final AdvancedModelRenderer rightFrontFin;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer mouth2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer leftBackFin2;
    private final AdvancedModelRenderer rightBackFin2;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer leftFrontFin2;
    private final AdvancedModelRenderer rightFrontFin2;

    public ModelSkeletonFalcatus() {
        this.textureWidth = 32;
        this.textureHeight = 64;

        this.falcatus = new AdvancedModelRenderer(this);
        this.falcatus.setRotationPoint(-6.0F, 23.0F, -5.0F);
        this.setRotateAngle(falcatus, 0.0F, 0.0F, 1.5708F);
        this.falcatus.cubeList.add(new ModelBox(falcatus, 2, 33, 0.0F, -16.0F, 1.0F, 1, 18, 13, 0.0F, false));
        this.falcatus.cubeList.add(new ModelBox(falcatus, 0, 42, 0.0F, 2.0F, 1.0F, 1, 3, 15, 0.0F, false));
        this.falcatus.cubeList.add(new ModelBox(falcatus, 0, 33, 0.0F, -19.0F, -14.0F, 1, 3, 15, 0.0F, false));
        this.falcatus.cubeList.add(new ModelBox(falcatus, 0, 33, 0.0F, 0.0F, -14.0F, 1, 3, 15, 0.0F, false));
        this.falcatus.cubeList.add(new ModelBox(falcatus, 4, 32, 0.0F, -16.0F, -12.0F, 1, 16, 13, 0.0F, false));
        this.falcatus.cubeList.add(new ModelBox(falcatus, 4, 32, 0.0F, -14.0F, 14.0F, 1, 16, 5, 0.0F, false));
        this.falcatus.cubeList.add(new ModelBox(falcatus, 4, 32, 0.0F, -16.0F, -17.0F, 1, 16, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.25F, 0.0F, 7.0F);
        this.falcatus.addChild(body);
        this.setRotateAngle(body, 0.0F, 3.1416F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.5F, -5.0F, -3.0F, 1, 3, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.9F, -6.8696F, -0.6366F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 23, -0.5F, -0.142F, -4.9806F, 1, 1, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6F, -6.0F, -1.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, 1.0F, -0.75F, 0.25F, 1, 3, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(2.0F, -4.0F, -2.75F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 1, 17, -1.5F, -1.0F, -2.0F, 1, 2, 2, 0.011F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 11, -1.25F, -0.5F, -1.75F, 1, 1, 1, -0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 11, -1.75F, -0.5F, -1.75F, 1, 1, 1, -0.05F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 6, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, -0.5F, -2.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 9, 1.5F, -0.5F, -1.0F, 1, 1, 2, 0.01F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(-1.0F, 1.25F, -0.1F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, -0.1309F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1571F, 0.1172F);
        this.mouth.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, -0.5F, -0.5F, -1.9F, 1, 1, 2, -0.011F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.1571F, -1.3828F);
        this.mouth.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.8499F, -1.1315F, 1, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(2.0F, -3.5F, 3.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 10, 9, -1.5F, -1.5F, 0.0F, 1, 3, 4, -0.01F, false));

        this.leftBackFin = new AdvancedModelRenderer(this);
        this.leftBackFin.setRotationPoint(1.5F, 0.75F, 3.75F);
        this.body2.addChild(leftBackFin);
        this.setRotateAngle(leftBackFin, 0.0F, 0.0F, -1.0472F);


        this.rightBackFin = new AdvancedModelRenderer(this);
        this.rightBackFin.setRotationPoint(-1.5F, 0.75F, 3.75F);
        this.body2.addChild(rightBackFin);
        this.rightBackFin.cubeList.add(new ModelBox(rightBackFin, 0, 18, 1.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.3768F, 3.9542F);
        this.body2.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 14, 0, -1.5F, -0.1232F, -0.9542F, 1, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.7232F, 2.0458F);
        this.tail1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 15, 0.3F, -0.75F, -1.0F, 0, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -0.6232F, 1.5458F);
        this.tail1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.1F, -0.1232F, 3.0458F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 18, -1.4F, 0.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.1F, 0.4577F, 2.8914F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 19, -0.5F, -3.4577F, -0.8914F, 0, 6, 7, -0.01F, false));

        this.leftFrontFin = new AdvancedModelRenderer(this);
        this.leftFrontFin.setRotationPoint(3.5F, -2.5F, 0.25F);
        this.body.addChild(leftFrontFin);
        this.setRotateAngle(leftFrontFin, 0.0F, 0.0F, -0.2618F);


        this.rightFrontFin = new AdvancedModelRenderer(this);
        this.rightFrontFin.setRotationPoint(1.6F, -3.0F, 0.25F);
        this.body.addChild(rightFrontFin);
        this.setRotateAngle(rightFrontFin, 0.2618F, 0.0F, 0.0F);
        this.rightFrontFin.cubeList.add(new ModelBox(rightFrontFin, 12, 16, -0.0818F, 0.5262F, -1.9969F, 0, 5, 5, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(1.3F, -4.5F, 4.0F);
        this.falcatus.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 3.1416F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.5F, -5.0F, -3.0F, 1, 3, 6, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(2.0F, -4.0F, -2.75F);
        this.body3.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 1, 17, -1.5F, -1.0F, -2.0F, 1, 2, 2, 0.011F, false));
        this.head2.cubeList.add(new ModelBox(head2, 7, 11, -1.25F, -0.5F, -1.75F, 1, 1, 1, -0.05F, false));
        this.head2.cubeList.add(new ModelBox(head2, 7, 11, -1.75F, -0.5F, -1.75F, 1, 1, 1, -0.05F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.head2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 6, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.0F, -0.5F, -2.75F);
        this.head2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 9, 1.5F, -0.5F, -1.0F, 1, 1, 2, 0.01F, false));

        this.mouth2 = new AdvancedModelRenderer(this);
        this.mouth2.setRotationPoint(-1.0F, 1.25F, -0.1F);
        this.head2.addChild(mouth2);
        this.setRotateAngle(mouth2, 0.0873F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.1571F, 0.1172F);
        this.mouth2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 0, -0.5F, -0.5F, -1.9F, 1, 1, 2, -0.011F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.1571F, -1.3828F);
        this.mouth2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.5F, -0.8499F, -1.1315F, 1, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(2.0F, -3.5F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 10, 9, -1.5F, -1.5F, 0.0F, 1, 3, 4, -0.01F, false));

        this.leftBackFin2 = new AdvancedModelRenderer(this);
        this.leftBackFin2.setRotationPoint(1.5F, 0.75F, 3.75F);
        this.body4.addChild(leftBackFin2);
        this.setRotateAngle(leftBackFin2, 0.0F, 0.0F, -1.0472F);


        this.rightBackFin2 = new AdvancedModelRenderer(this);
        this.rightBackFin2.setRotationPoint(-1.5F, 0.75F, 3.75F);
        this.body4.addChild(rightBackFin2);
        this.rightBackFin2.cubeList.add(new ModelBox(rightBackFin2, 0, 18, 1.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.3768F, 3.9542F);
        this.body4.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 0, -1.5F, -0.1232F, -0.9542F, 1, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.7232F, 2.0458F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9163F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 15, 0.4F, -0.75F, -1.0F, 0, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -0.6232F, 1.5458F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 0, 0.0F, 0.0F, -0.5F, 1, 1, 1, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.1F, -0.1232F, 2.7958F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 22, 18, -1.4F, 0.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.1F, 0.4577F, 2.8914F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1745F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 6, 19, -0.5F, -3.4577F, -0.8914F, 0, 6, 7, -0.01F, false));

        this.leftFrontFin2 = new AdvancedModelRenderer(this);
        this.leftFrontFin2.setRotationPoint(3.5F, -2.5F, 0.25F);
        this.body3.addChild(leftFrontFin2);
        this.setRotateAngle(leftFrontFin2, 0.0F, 0.0F, -0.2618F);


        this.rightFrontFin2 = new AdvancedModelRenderer(this);
        this.rightFrontFin2.setRotationPoint(1.6F, -3.75F, -0.25F);
        this.body3.addChild(rightFrontFin2);
        this.setRotateAngle(rightFrontFin2, 0.6545F, 0.0F, 0.0F);
        this.rightFrontFin2.cubeList.add(new ModelBox(rightFrontFin2, 0, 22, -0.0818F, 0.5262F, -1.9969F, 0, 5, 5, 0.0F, true));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.falcatus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
