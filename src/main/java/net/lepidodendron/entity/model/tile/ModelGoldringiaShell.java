package net.lepidodendron.entity.model.tile;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelGoldringiaShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Shell1;
    private final AdvancedModelRendererExtended Shell2;
    private final AdvancedModelRendererExtended Shell3;
    private final AdvancedModelRendererExtended Shell6_r1;
    private final AdvancedModelRendererExtended Shell4;
    private final AdvancedModelRendererExtended Shell5;
    private final AdvancedModelRendererExtended Shell8_r1;
    private final AdvancedModelRendererExtended Shell6;
    private final AdvancedModelRendererExtended Shell9_r1;
    private final AdvancedModelRendererExtended Shell7;
    private final AdvancedModelRendererExtended Shell10_r1;
    private final AdvancedModelRendererExtended Shell8;
    private final AdvancedModelRendererExtended Shell9;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended Shell4_r1;
    private final AdvancedModelRendererExtended Shell3_r1;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended Shell5_r1;
    private final AdvancedModelRendererExtended Shell4_r2;
    private final AdvancedModelRendererExtended Mantle;
    private final AdvancedModelRendererExtended Siphon;
    private final AdvancedModelRendererExtended Tentacle1a;
    private final AdvancedModelRendererExtended Tentacle1b;
    private final AdvancedModelRendererExtended Tentacle6a;
    private final AdvancedModelRendererExtended Tentacle6b;
    private final AdvancedModelRendererExtended Tentacle2a;
    private final AdvancedModelRendererExtended Tentacle2b;
    private final AdvancedModelRendererExtended Tentacle7a;
    private final AdvancedModelRendererExtended Tentacle7b;
    private final AdvancedModelRendererExtended Tentacle3a;
    private final AdvancedModelRendererExtended Tentacle3b;
    private final AdvancedModelRendererExtended Tentacle8a;
    private final AdvancedModelRendererExtended Tentacle8b;
    private final AdvancedModelRendererExtended Tentacle4a;
    private final AdvancedModelRendererExtended Tentacle4b;
    private final AdvancedModelRendererExtended Tentacle9a;
    private final AdvancedModelRendererExtended Tentacle9b;
    private final AdvancedModelRendererExtended Tentacle5a;
    private final AdvancedModelRendererExtended Tentacle5b;
    private final AdvancedModelRendererExtended Tentacle10a;
    private final AdvancedModelRendererExtended Tentacle10b;
    private final AdvancedModelRendererExtended Shellbase;

    public ModelGoldringiaShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.1792F, 0.0F, 0.0F);


        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(-0.01F, 0.35F, 1.4F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.4882F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 14, -2.99F, -3.0F, -7.0F, 6, 6, 7, 0.01F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 3, -3.0F, 3.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 27, -3.0F, 3.0F, -3.5F, 1, 2, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 21, 7, -3.0F, 3.0F, -6.0F, 1, 2, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 30, -4.0F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 4, -4.0F, -1.75F, -6.5F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 2, -4.0F, -4.75F, -7.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 0, -3.5F, -8.0F, -7.25F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 21, 3, -3.25F, -9.5F, -5.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 14, 9, -2.75F, -9.25F, -2.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 14, 3, -2.75F, -8.0F, -0.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 7, 9, -2.5F, -6.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 9, -2.25F, -4.25F, -1.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 7, 3, -2.0F, -4.25F, -4.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 30, 3.02F, -0.25F, -4.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 4, 3.02F, -1.75F, -6.5F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 2, 3.02F, -4.75F, -7.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 0, 2.52F, -8.0F, -7.25F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 21, 3, 2.27F, -9.5F, -5.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 14, 9, 1.77F, -9.25F, -2.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 14, 3, 1.77F, -8.0F, -0.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 7, 9, 1.52F, -6.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 9, 1.27F, -4.25F, -1.75F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 7, 3, 1.02F, -4.25F, -4.0F, 1, 1, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 21, 7, 2.02F, 3.0F, -6.0F, 1, 2, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 27, 2.02F, 3.0F, -3.5F, 1, 2, 1, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 3, 2.02F, 3.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.01F, 0.9F, -4.9F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.7854F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 19, 7, -3.0F, -3.0F, -7.0F, 6, 6, 7, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 21, 0, -3.0F, 3.0F, -2.5F, 1, 2, 1, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 21, 0, 2.0F, 3.0F, -2.5F, 1, 2, 1, 0.0F, false));

        this.Shell6_r1 = new AdvancedModelRendererExtended(this);
        this.Shell6_r1.setRotationPoint(0.0F, 2.25F, 3.5F);
        this.Shell3.addChild(Shell6_r1);
        this.setRotateAngle(Shell6_r1, -0.2618F, 0.0F, 0.0F);
        this.Shell6_r1.cubeList.add(new ModelBox(Shell6_r1, 0, 18, 1.75F, 2.95F, -10.25F, 1, 2, 1, 0.0F, false));
        this.Shell6_r1.cubeList.add(new ModelBox(Shell6_r1, 0, 18, -2.75F, 2.95F, -10.25F, 1, 2, 1, 0.0F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, 1.11F, -4.66F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -1.066F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 19, 20, -2.5F, -2.0F, -7.0F, 5, 5, 7, 0.01F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 3, 16, -2.5F, 3.0F, -4.5F, 1, 2, 1, 0.0F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 3, 16, 1.5F, 3.0F, -4.5F, 1, 2, 1, 0.0F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(-0.01F, 1.02F, -4.75F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8491F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 27, -2.49F, -3.0F, -6.0F, 5, 6, 6, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 14, 6, -2.5F, 3.0F, -2.0F, 1, 2, 1, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 14, 6, 1.52F, 3.0F, -2.0F, 1, 2, 1, 0.0F, false));

        this.Shell8_r1 = new AdvancedModelRendererExtended(this);
        this.Shell8_r1.setRotationPoint(0.01F, 0.12F, 12.91F);
        this.Shell5.addChild(Shell8_r1);
        this.setRotateAngle(Shell8_r1, -0.2618F, 0.0F, 0.0F);
        this.Shell8_r1.cubeList.add(new ModelBox(Shell8_r1, 14, 0, 1.26F, 6.88F, -17.91F, 1, 2, 1, 0.0F, false));
        this.Shell8_r1.cubeList.add(new ModelBox(Shell8_r1, 14, 0, -2.26F, 6.88F, -17.91F, 1, 2, 1, 0.0F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 1.2F, -4.25F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7878F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 22, 32, -1.99F, -1.5F, -6.0F, 4, 4, 6, 0.0F, false));
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 14, -2.0F, 2.5F, -3.0F, 1, 2, 1, 0.0F, false));
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 14, 1.02F, 2.5F, -3.0F, 1, 2, 1, 0.0F, false));

        this.Shell9_r1 = new AdvancedModelRendererExtended(this);
        this.Shell9_r1.setRotationPoint(0.01F, -0.98F, 17.26F);
        this.Shell6.addChild(Shell9_r1);
        this.setRotateAngle(Shell9_r1, -0.3054F, 0.0F, 0.0F);
        this.Shell9_r1.cubeList.add(new ModelBox(Shell9_r1, 7, 6, 0.96F, 9.23F, -21.26F, 1, 2, 1, 0.0F, false));
        this.Shell9_r1.cubeList.add(new ModelBox(Shell9_r1, 7, 6, -1.96F, 9.23F, -21.26F, 1, 2, 1, 0.0F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.01F, 1.2F, -3.8F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -1.1298F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 39, -2.0F, -1.5F, -4.0F, 4, 4, 4, -0.01F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 7, 0, -1.975F, 2.0F, -2.25F, 1, 2, 1, 0.0F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 7, 0, 0.975F, 2.0F, -2.25F, 1, 2, 1, 0.0F, false));

        this.Shell10_r1 = new AdvancedModelRendererExtended(this);
        this.Shell10_r1.setRotationPoint(0.0F, -1.98F, 21.26F);
        this.Shell7.addChild(Shell10_r1);
        this.setRotateAngle(Shell10_r1, -0.1745F, 0.0F, 0.0F);
        this.Shell10_r1.cubeList.add(new ModelBox(Shell10_r1, 0, 6, 0.75F, 8.23F, -24.26F, 1, 2, 1, 0.0F, false));
        this.Shell10_r1.cubeList.add(new ModelBox(Shell10_r1, 0, 6, -1.75F, 8.23F, -24.26F, 1, 2, 1, 0.0F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, 0.45F, -2.4F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.6191F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 19, 48, -1.5F, -0.5F, -3.1F, 3, 3, 3, 0.01F, false));
        this.Shell8.cubeList.add(new ModelBox(Shell8, 0, 0, -1.5F, 1.75F, -1.85F, 1, 2, 1, 0.0F, false));
        this.Shell8.cubeList.add(new ModelBox(Shell8, 0, 0, 0.5F, 1.75F, -1.85F, 1, 2, 1, 0.0F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(-0.01F, 0.85F, -1.25F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.8137F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 36, 36, -1.49F, -3.5F, -6.0F, 3, 6, 6, 0.0F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(-3.015F, 0.15F, -0.15F);
        this.Shell2.addChild(bone);
        this.setRotateAngle(bone, 0.0F, -0.0873F, 0.0F);


        this.Shell4_r1 = new AdvancedModelRendererExtended(this);
        this.Shell4_r1.setRotationPoint(3.0F, 2.0F, 0.0F);
        this.bone.addChild(Shell4_r1);
        this.setRotateAngle(Shell4_r1, 0.6545F, 0.0F, 0.0F);
        this.Shell4_r1.cubeList.add(new ModelBox(Shell4_r1, 39, 14, -3.01F, -1.15F, -0.4F, 1, 2, 6, 0.0F, false));

        this.Shell3_r1 = new AdvancedModelRendererExtended(this);
        this.Shell3_r1.setRotationPoint(3.0F, 2.0F, 0.0F);
        this.bone.addChild(Shell3_r1);
        this.setRotateAngle(Shell3_r1, 0.3927F, 0.0F, 0.0F);
        this.Shell3_r1.cubeList.add(new ModelBox(Shell3_r1, 0, 0, -3.035F, -2.65F, 0.45F, 1, 2, 12, 0.0F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(3.035F, 0.15F, -0.15F);
        this.Shell2.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.0873F, 0.0F);


        this.Shell5_r1 = new AdvancedModelRendererExtended(this);
        this.Shell5_r1.setRotationPoint(-3.0F, 2.0F, 0.0F);
        this.bone2.addChild(Shell5_r1);
        this.setRotateAngle(Shell5_r1, 0.6545F, 0.0F, 0.0F);
        this.Shell5_r1.cubeList.add(new ModelBox(Shell5_r1, 39, 14, 2.01F, -1.15F, -0.4F, 1, 2, 6, 0.0F, false));

        this.Shell4_r2 = new AdvancedModelRendererExtended(this);
        this.Shell4_r2.setRotationPoint(-3.0F, 2.0F, 0.0F);
        this.bone2.addChild(Shell4_r2);
        this.setRotateAngle(Shell4_r2, 0.3927F, 0.0F, 0.0F);
        this.Shell4_r2.cubeList.add(new ModelBox(Shell4_r2, 0, 0, 2.035F, -2.65F, 0.45F, 1, 2, 12, 0.0F, false));

        this.Mantle = new AdvancedModelRendererExtended(this);
        this.Mantle.setRotationPoint(0.0F, -2.5F, 1.6F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.2536F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 38, 0, -2.5F, 0.0F, 0.0F, 5, 5, 4, 0.0F, false));

        this.Siphon = new AdvancedModelRendererExtended(this);
        this.Siphon.setRotationPoint(0.0F, 2.45F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.3409F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 38, 27, -1.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRendererExtended(this);
        this.Tentacle1a.setRotationPoint(-1.4F, 3.5F, 3.5F);
        this.Mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.7854F, 0.0424F, 0.0F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 47, 9, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRendererExtended(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.2335F, 0.1061F, 0.0F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 7, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRendererExtended(this);
        this.Tentacle6a.setRotationPoint(1.4F, 3.5F, 3.5F);
        this.Mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.7854F, -0.0424F, 0.0F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 47, 9, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRendererExtended(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.2335F, -0.1061F, 0.0F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 7, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRendererExtended(this);
        this.Tentacle2a.setRotationPoint(-1.55F, 2.9F, 3.5F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.6793F, -0.1698F, 0.0F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 23, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRendererExtended(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.3183F, 0.3609F, 0.0F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 0, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRendererExtended(this);
        this.Tentacle7a.setRotationPoint(1.55F, 2.9F, 3.5F);
        this.Mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.6793F, 0.1698F, 0.0F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 23, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRendererExtended(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, -0.3183F, -0.3609F, 0.0F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 0, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRendererExtended(this);
        this.Tentacle3a.setRotationPoint(-1.8F, 2.2F, 3.5F);
        this.Mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.6156F, -0.0424F, 0.0F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 21, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRendererExtended(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.2759F, 0.1698F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 11, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRendererExtended(this);
        this.Tentacle8a.setRotationPoint(1.8F, 2.2F, 3.5F);
        this.Mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.6156F, 0.0424F, 0.0F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 21, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRendererExtended(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.2759F, -0.1698F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 11, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRendererExtended(this);
        this.Tentacle4a.setRotationPoint(-1.45F, 1.8F, 3.5F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.5095F, 0.0637F, 0.0F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRendererExtended(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.2972F, -0.0637F, 0.0F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 14, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRendererExtended(this);
        this.Tentacle9a.setRotationPoint(1.45F, 1.8F, 3.5F);
        this.Mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.5095F, -0.0637F, 0.0F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRendererExtended(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.2972F, 0.0637F, 0.0F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 14, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRendererExtended(this);
        this.Tentacle5a.setRotationPoint(-0.8F, 1.4F, 3.5F);
        this.Mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.4671F, 0.0637F, 0.0F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRendererExtended(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.2546F, -0.1061F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 0, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRendererExtended(this);
        this.Tentacle10a.setRotationPoint(0.8F, 1.4F, 3.5F);
        this.Mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.4671F, -0.0637F, 0.0F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRendererExtended(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.2546F, 0.1061F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 0, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Shellbase = new AdvancedModelRendererExtended(this);
        this.Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Shell1.offsetY = -1.2F;
        this.Shell1.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
