package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDidymograptus extends AdvancedModelBase {
    private final AdvancedModelRenderer full;
    private final AdvancedModelRenderer right;
    private final AdvancedModelRenderer rightt_r1;
    private final AdvancedModelRenderer boneR;
    private final AdvancedModelRenderer rightb_r1;
    private final AdvancedModelRenderer left;
    private final AdvancedModelRenderer leftt_r1;
    private final AdvancedModelRenderer boneL;
    private final AdvancedModelRenderer leftb_r1;

    public ModelDidymograptus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.full = new AdvancedModelRenderer(this);
        this.full.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.full.cubeList.add(new ModelBox(full, 0, 0, -0.5F, -15.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.full.cubeList.add(new ModelBox(full, 0, 2, 0.0F, -14.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.right = new AdvancedModelRenderer(this);
        this.right.setRotationPoint(0.0F, -11.0F, 0.5F);
        this.full.addChild(right);


        this.rightt_r1 = new AdvancedModelRenderer(this);
        this.rightt_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.right.addChild(rightt_r1);
        this.setRotateAngle(rightt_r1, 0.3927F, 0.0F, 0.0F);
        this.rightt_r1.cubeList.add(new ModelBox(rightt_r1, 14, 0, 0.01F, 0.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.boneR = new AdvancedModelRenderer(this);
        this.boneR.setRotationPoint(0.0F, 5.75F, 2.5F);
        this.right.addChild(boneR);


        this.rightb_r1 = new AdvancedModelRenderer(this);
        this.rightb_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.boneR.addChild(rightb_r1);
        this.setRotateAngle(rightb_r1, 0.1745F, 0.0F, 0.0F);
        this.rightb_r1.cubeList.add(new ModelBox(rightb_r1, 14, 9, 0.0F, 0.05F, -0.8F, 0, 6, 1, 0.0F, false));

        this.left = new AdvancedModelRenderer(this);
        this.left.setRotationPoint(0.0F, -11.0F, 0.5F);
        this.full.addChild(left);


        this.leftt_r1 = new AdvancedModelRenderer(this);
        this.leftt_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.left.addChild(leftt_r1);
        this.setRotateAngle(leftt_r1, -0.3927F, 0.0F, 0.0F);
        this.leftt_r1.cubeList.add(new ModelBox(leftt_r1, 12, 0, -0.01F, 0.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.boneL = new AdvancedModelRenderer(this);
        this.boneL.setRotationPoint(0.0F, 5.75F, -2.5F);
        this.left.addChild(boneL);
        this.setRotateAngle(boneL, -0.0436F, 0.0F, 0.0F);


        this.leftb_r1 = new AdvancedModelRenderer(this);
        this.leftb_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.boneL.addChild(leftb_r1);
        this.setRotateAngle(leftb_r1, -0.1309F, 0.0F, 0.0F);
        this.leftb_r1.cubeList.add(new ModelBox(leftb_r1, 12, 9, 0.0F, 0.0F, -0.2F, 0, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.full.render(f5 * 0.36F);
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

        this.full.offsetY = 0.9F;

        AdvancedModelRenderer[] Right = {this.right, this.boneR};
        AdvancedModelRenderer[] Left = {this.left, this.boneL};

        float speed = 0.09F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.swing(full, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(full, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(full, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(full, -speed * 0.5F, 0.5F, false, f2, 0.6F);

            this.chainWave(Right, 0.12F, 0.15F, 1F, f2, 0.5F);
            this.chainWave(Left, 0.12F, 0.15F, -1F, -f2, -0.5F);
        }
    }
}
