package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCarolowilhelmina extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer bodyf;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail;

    public ModelCarolowilhelmina() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -11.0F, -15.0F, 6, 7, 15, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.0F, -4.0F, -12.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 0.6981F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 35, 0.0F, 0.0F, -2.0F, 0, 7, 10, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.0F, -4.0F, -12.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -0.6981F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 35, 0.0F, 0.0F, -2.0F, 0, 7, 10, 0.0F, true));

        this.bodyf = new AdvancedModelRenderer(this);
        this.bodyf.setRotationPoint(0.0F, -7.5F, -15.0F);
        this.body.addChild(bodyf);
        this.bodyf.cubeList.add(new ModelBox(bodyf, 27, 0, -2.5F, -2.0F, -5.0F, 5, 4, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.bodyf.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 42, -2.0F, -2.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.bodyf.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 13, -2.0F, -0.25F, 0.0F, 4, 2, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.bodyf.addChild(head);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 44, 50, -2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 46, 21, -0.5F, -1.85F, -12.75F, 1, 1, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 48, -1.5F, 0.0F, -1.0F, 3, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 9, -1.0F, 0.25F, -0.95F, 2, 2, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 28, 0.0F, -11.0F, 0.0F, 0, 8, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 26, 22, -2.0F, -3.0F, -1.0F, 4, 6, 12, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.0F, 3.0F, 2.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, 0.0F, 0.0F, -2.0F, 0, 4, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.0F, 3.0F, 2.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 0, 0.0F, 0.0F, -2.0F, 0, 4, 5, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 46, -1.5F, -2.0F, -1.0F, 3, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 54, 0.0F, 2.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 41, 2, -1.0F, -1.5F, -1.0F, 2, 3, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, 0.0F, -12.25F, -1.0F, 0, 23, 13, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.60F);
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
        this.body.offsetY = 0.65F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.tail};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.265F, -2, f2, 1);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.45F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
