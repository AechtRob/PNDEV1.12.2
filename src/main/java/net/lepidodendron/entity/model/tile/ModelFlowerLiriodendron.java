package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerLiriodendron extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer bonex4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer bonex3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer bonex2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer bonex;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelFlowerLiriodendron() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 11, 14, -0.5F, -2.9F, -0.5F, 1, 3, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -1.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, 3.1416F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone6.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.6981F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, 1.35F, -4.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone6.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -4.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, 2.0944F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.6981F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 13, 1.35F, -4.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, 0.0F, -4.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 1.0472F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.6981F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, 1.35F, -4.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 0, 0.0F, -4.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, -2.0944F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.6981F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 14, 1.35F, -4.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 4, 0.0F, -4.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -1.0472F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.6981F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 12, 1.35F, -4.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, 0.0F, -4.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.bonex4 = new AdvancedModelRenderer(this);
        this.bonex4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bonex4);
        this.setRotateAngle(bonex4, 0.0F, 1.5708F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.bonex4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 0, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.bonex3 = new AdvancedModelRenderer(this);
        this.bonex3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bonex3);
        this.setRotateAngle(bonex3, 0.0F, 3.1416F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.bonex3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 3, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.bonex2 = new AdvancedModelRenderer(this);
        this.bonex2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bonex2);
        this.setRotateAngle(bonex2, 0.0F, -1.5708F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.bonex2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 6, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.bonex = new AdvancedModelRenderer(this);
        this.bonex.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bonex);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.bonex.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 9, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.6981F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 15, 1.35F, -4.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 8, 0.0F, -4.0F, -1.5F, 0, 4, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        //this.base.offsetY = -1.5F;
        //this.base.render(0.1f);
        this.base.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
