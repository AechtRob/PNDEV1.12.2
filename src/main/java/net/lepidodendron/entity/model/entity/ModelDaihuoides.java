package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEoandromeda;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelDaihuoides extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer outer;
    private final AdvancedModelRenderer innerOfOuter;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;

    public ModelDaihuoides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.0F, -2.5F, 6, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0742F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 10, -2.5F, 0.0F, -2.0F, 5, 0, 4, 0.0F, false));

        this.outer = new AdvancedModelRenderer(this);
        this.outer.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(outer);
        this.outer.cubeList.add(new ModelBox(outer, 14, 16, 3.0F, -2.0F, -2.5F, 3, 3, 5, 0.0F, false));
        this.outer.cubeList.add(new ModelBox(outer, 14, 16, -6.0F, -2.0F, -2.5F, 3, 3, 5, 0.0F, true));
        this.outer.cubeList.add(new ModelBox(outer, 23, 25, 2.0F, -1.5F, 1.5F, 3, 2, 3, 0.0F, false));
        this.outer.cubeList.add(new ModelBox(outer, 23, 25, -5.0F, -1.5F, 1.5F, 3, 2, 3, 0.0F, true));
        this.outer.cubeList.add(new ModelBox(outer, 10, 25, 2.0F, -1.5F, -4.5F, 3, 2, 3, 0.0F, false));
        this.outer.cubeList.add(new ModelBox(outer, 10, 25, -5.0F, -1.5F, -4.5F, 3, 2, 3, 0.0F, true));
        this.outer.cubeList.add(new ModelBox(outer, 0, 14, -3.0F, -2.0F, 2.5F, 6, 3, 3, 0.0F, false));
        this.outer.cubeList.add(new ModelBox(outer, 0, 7, -3.0F, -2.0F, -5.5F, 6, 3, 3, 0.0F, false));

        this.innerOfOuter = new AdvancedModelRenderer(this);
        this.innerOfOuter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.outer.addChild(innerOfOuter);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -3.75F);
        this.innerOfOuter.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -2.5F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, 3.75F);
        this.innerOfOuter.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 5, -2.5F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.25F, -0.5F, -2.75F);
        this.innerOfOuter.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0873F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 15, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.25F, -0.5F, -2.75F);
        this.innerOfOuter.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, -0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 15, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.25F, -0.5F, 2.75F);
        this.innerOfOuter.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0873F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 28, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.25F, -0.5F, 2.75F);
        this.innerOfOuter.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, -0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 28, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.25F, -0.5F, 0.0F);
        this.innerOfOuter.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.25F, -0.5F, 0.0F);
        this.innerOfOuter.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1309F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 21, -1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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



        float speed = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(main, -speed * 0.5F, 0.5F, false, f2, 0.6F);
            EntityPrehistoricFloraEoandromeda ee = (EntityPrehistoricFloraEoandromeda) e;
            this.main.rotateAngleY = (float) Math.toRadians(ee.getRotationDegree());
        }
    }
}
