package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBoiotremus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBoiotremus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer face;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle17;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle18;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer bone;

    public ModelBoiotremus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Snail = new AdvancedModelRenderer(this);
        this.Snail.setRotationPoint(0.0F, 15.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.Snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 0, 14, -4.0F, -1.0F, -4.0F, 8, 1, 10, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 25, -4.0F, -2.0F, -2.0F, 8, 1, 6, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 42, -3.0F, -2.25F, -2.0F, 6, 1, 6, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 12, -3.0F, -2.0F, 4.0F, 6, 1, 1, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 10, -3.0F, -2.0F, -3.0F, 6, 1, 1, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 36, 22, -3.0F, -1.0F, 6.0F, 6, 1, 2, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 19, -2.0F, -1.0F, 8.0F, 4, 1, 1, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 34, 33, -3.0F, -1.0F, -5.0F, 6, 1, 1, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 10, 33, 4.0F, -1.0F, -3.0F, 1, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 32, -5.0F, -1.0F, -3.0F, 1, 1, 8, 0.0F, false));

        this.face = new AdvancedModelRenderer(this);
        this.face.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.foot.addChild(face);
        this.setRotateAngle(face, 0.3491F, 0.0F, 0.0F);
        this.face.cubeList.add(new ModelBox(face, 0, 17, -2.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));
        this.face.cubeList.add(new ModelBox(face, 0, 14, -1.5F, 0.0F, -3.0F, 3, 1, 2, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(-4.0F, -2.0F, -1.0F);
        this.foot.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.035F, -0.2595F, -0.1355F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 25, 16, -3.0F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(4.0F, -2.0F, -1.0F);
        this.foot.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.035F, 0.2595F, 0.1355F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 25, 16, 0.0F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-4.0F, -1.925F, -0.25F);
        this.foot.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, -0.0436F, -0.3491F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 9, 32, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(4.0F, -1.925F, -0.25F);
        this.foot.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.0F, 0.0436F, 0.3491F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 9, 32, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-4.0F, -2.0F, 1.0F);
        this.foot.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.0873F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 25, 15, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(4.0F, -2.0F, 1.0F);
        this.foot.addChild(tentacle12);
        this.setRotateAngle(tentacle12, 0.0F, 0.0F, 0.0873F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 25, 15, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(-3.0F, -2.0F, -2.0F);
        this.foot.addChild(tentacle6);
        this.setRotateAngle(tentacle6, 0.3037F, -0.6878F, -0.4586F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 23, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(3.0F, -2.0F, -2.0F);
        this.foot.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.3037F, 0.6878F, 0.4586F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 0, 23, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(-3.0F, -2.0F, 4.0F);
        this.foot.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.3037F, 0.6878F, -0.4586F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 22, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(3.0F, -2.0F, 4.0F);
        this.foot.addChild(tentacle14);
        this.setRotateAngle(tentacle14, -0.3037F, -0.6878F, 0.4586F);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 0, 22, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(-2.25F, -1.875F, 4.75F);
        this.foot.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.1733F, 1.1098F, -0.3392F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 21, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(2.25F, -1.875F, 4.75F);
        this.foot.addChild(tentacle15);
        this.setRotateAngle(tentacle15, -0.1733F, -1.1098F, 0.3392F);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 0, 21, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(-1.0F, -1.875F, 4.75F);
        this.foot.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.6597F, 1.2598F, -0.5807F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 25, 22, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(1.0F, -1.875F, 4.75F);
        this.foot.addChild(tentacle16);
        this.setRotateAngle(tentacle16, -0.6597F, -1.2598F, 0.5807F);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 25, 22, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-4.0F, -2.0F, 2.25F);
        this.foot.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.0F, 0.0436F, -0.4363F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 25, 23, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tentacle17 = new AdvancedModelRenderer(this);
        this.tentacle17.setRotationPoint(4.0F, -2.0F, 2.25F);
        this.foot.addChild(tentacle17);
        this.setRotateAngle(tentacle17, 0.0F, -0.0436F, 0.4363F);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 25, 23, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-4.0F, -2.0F, 3.0F);
        this.foot.addChild(tentacle5);
        this.setRotateAngle(tentacle5, -0.0579F, 0.2555F, -0.2256F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 25, 14, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.tentacle18 = new AdvancedModelRenderer(this);
        this.tentacle18.setRotationPoint(4.0F, -2.0F, 3.0F);
        this.foot.addChild(tentacle18);
        this.setRotateAngle(tentacle18, -0.0579F, -0.2555F, 0.2256F);
        this.tentacle18.cubeList.add(new ModelBox(tentacle18, 25, 14, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(1.0F, -1.5F, -3.75F);
        this.foot.addChild(rightEye);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 4, 0, 0.0F, 0.0F, -6.0F, 2, 0, 6, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(-1.0F, -1.5F, -3.75F);
        this.foot.addChild(leftEye);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 0, 0, -2.0F, 0.0F, -6.0F, 2, 0, 6, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 6.75F, -1.0F);
        this.Snail.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.5F, 0.0F, -7.0F, 13, 0, 14, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 35, 35, -1.5F, -3.875F, 3.0F, 3, 4, 5, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 21, 25, -3.0F, -1.0F, -3.0F, 6, 1, 7, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 40, 5, -1.0F, 0.125F, 4.0F, 2, 1, 4, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-0.5F, -4.0F, 3.0F);
        this.shell.addChild(bone);
        this.setRotateAngle(bone, 0.6109F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 26, 14, -1.5F, 0.1024F, -7.0717F, 4, 1, 7, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 20, 33, -1.5F, 1.1024F, -6.0717F, 4, 1, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 40, 0, -1.5F, 2.1024F, -4.0717F, 4, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 6, -1.5F, 3.1024F, -3.0717F, 4, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        Snail.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Snail.offsetY = -2.2F;
        this.Snail.offsetX = -0.1F;
        this.Snail.rotateAngleY = (float)Math.toRadians(-68);
        this.Snail.rotateAngleX = (float)Math.toRadians(30);
        this.Snail.rotateAngleZ = (float)Math.toRadians(0);
        float scaler = 2.5F;
        this.Snail.scaleChildren = true;
        this.Snail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Snail, 0.6F, 3.8F, -0.4F);
        //End of pose, now render the model:
        this.Snail.render(f);
        //Reset rotations, positions and sizing:
        this.Snail.setScale(1.0F, 1.0F, 1.0F);
        this.Snail.scaleChildren = false;
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
       // this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraBoiotremus ee = (EntityPrehistoricFloraBoiotremus) e;

        this.Snail.offsetZ = 0.13F;
        this.Snail.offsetX = 0.06F;
        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler*0.85F);
        //float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.3F);
        //this.tail.setScaleX(scaler2 * 0.95F);

        this.swing(leftEye, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(rightEye, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(leftEye, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(rightEye, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.leftEye.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.leftEye.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.rightEye.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.rightEye.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.Snail.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.Snail.setScaleZ(scaler);
    }
}
