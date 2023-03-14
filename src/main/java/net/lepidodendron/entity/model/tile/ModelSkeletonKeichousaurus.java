package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKeichousaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer Keichousaurus;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerJaw;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer rightarm4;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer leftarm4;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer leftfoot;

    public ModelSkeletonKeichousaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -15.0F, -0.99F, -6.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -13.0F, -0.99F, 10.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -0.99F, 3.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -0.99F, 15.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -0.99F, 25.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -20.0F, -0.99F, -22.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -0.99F, -22.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -0.99F, -13.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -17.0F, -0.99F, -30.0F, 16, 1, 16, 0.0F, false));

        this.Keichousaurus = new AdvancedModelRenderer(this);
        this.Keichousaurus.setRotationPoint(0.0F, 2.95F, 0.0F);
        this.bone.addChild(Keichousaurus);


        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -4.0F, -7.0F);
        this.Keichousaurus.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 28, 29, -3.0F, -1.0F, -5.0F, 6, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.25F, -0.25F);
        this.upperbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 25, -3.0F, 2.35F, -4.0F, 4, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.25F, -0.25F);
        this.upperbody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 25, -1.0F, 2.35F, -4.0F, 4, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1915F, -4.6771F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.3927F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 29, -1.0F, -1.1915F, -8.0729F, 2, 1, 8, 0.011F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -1.5F, -0.1915F, -8.0729F, 3, 0, 8, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6915F, -7.8229F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, 0.6545F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 5, 29, -0.5F, -0.5F, -9.25F, 1, 1, 9, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 0, -1.0F, 0.5F, -9.25F, 2, 0, 9, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -9.25F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0F, 1.1345F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 39, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, -4, 52, -0.5F, -0.02F, -5.0F, 1, 0, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 39, -1.5F, 0.0F, -7.0F, 3, 1, 3, 0.0F, false));

        this.lowerJaw = new AdvancedModelRenderer(this);
        this.lowerJaw.setRotationPoint(0.0F, 1.5F, -0.25F);
        this.head.addChild(lowerJaw);


        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-4.0F, -2.5F, -1.25F);
        this.upperbody.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.7854F, 0.0F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 27, 25, -6.0F, 1.75F, -1.0F, 6, 1, 2, 0.0F, false));

        this.rightarm4 = new AdvancedModelRenderer(this);
        this.rightarm4.setRotationPoint(-6.0F, 2.0F, -0.25F);
        this.rightarm3.addChild(rightarm4);
        this.setRotateAngle(rightarm4, 0.0F, 0.4363F, 0.0F);
        this.rightarm4.cubeList.add(new ModelBox(rightarm4, 0, 17, -4.0F, -0.25F, -0.75F, 4, 1, 1, -0.01F, false));
        this.rightarm4.cubeList.add(new ModelBox(rightarm4, 0, 14, -4.0F, -0.25F, 0.75F, 4, 1, 1, -0.01F, false));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-3.25F, -0.25F, 0.0F);
        this.rightarm4.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0873F, 0.0F);
        this.righthand.cubeList.add(new ModelBox(righthand, 0, 9, -5.5F, 0.75F, -2.0F, 5, 0, 5, 0.0F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(4.0F, -2.5F, -1.25F);
        this.upperbody.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, -0.9599F, 0.0F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 27, 25, 0.0F, 1.75F, -1.0F, 6, 1, 2, 0.0F, true));

        this.leftarm4 = new AdvancedModelRenderer(this);
        this.leftarm4.setRotationPoint(6.0F, 2.0F, -0.25F);
        this.leftarm3.addChild(leftarm4);
        this.setRotateAngle(leftarm4, 0.0F, -0.4363F, 0.0F);
        this.leftarm4.cubeList.add(new ModelBox(leftarm4, 0, 17, 0.0F, -0.25F, -0.75F, 4, 1, 1, -0.01F, true));
        this.leftarm4.cubeList.add(new ModelBox(leftarm4, 0, 14, 0.0F, -0.25F, 0.75F, 4, 1, 1, -0.01F, true));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(3.25F, -0.25F, 0.0F);
        this.leftarm4.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, -0.0873F, 0.0F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 0, 9, 0.5F, 0.75F, -2.0F, 5, 0, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Keichousaurus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -4.0F, -5.0F, -7.0F, 8, 1, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0436F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 32, 35, -3.0F, -2.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0837F, 4.221F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0436F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 40, -2.0F, -2.0837F, -0.221F, 4, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.0837F, 3.779F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0873F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 18, -1.5F, -1.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.1309F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 45, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.1309F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 40, -0.5F, -0.75F, 0.0F, 1, 1, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.1745F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 18, 38, -0.5F, -0.75F, 0.0F, 1, 1, 7, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-3.0F, -1.0F, 3.0F);
        this.body2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.0F, -0.5236F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 32, -0.5F, -0.75F, -0.75F, 1, 1, 5, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0F, 0.2182F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 4, -1.0F, -0.75F, 0.0F, 1, 1, 3, 0.0F, false));
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 0, 0.5F, -0.75F, 0.0F, 1, 1, 3, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.rightleg4.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.0F, 0.1745F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 20, 17, -2.5F, 0.25F, -0.25F, 6, 0, 7, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(3.0F, -1.0F, 3.0F);
        this.body2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, 0.5236F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 32, -0.5F, -0.75F, -0.75F, 1, 1, 5, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0F, -0.2182F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 4, 0.0F, -0.75F, 0.0F, 1, 1, 3, 0.0F, true));
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 0, -1.5F, -0.75F, 0.0F, 1, 1, 3, 0.0F, true));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.leftleg4.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.0F, -0.1745F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 20, 17, -3.5F, 0.25F, -0.25F, 6, 0, 7, 0.0F, true));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
